package com.darkhorse.getsporty.web.controller.event;

import java.math.BigInteger;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.darkhorse.getsporty.domain.Event;
import com.darkhorse.getsporty.util.Utils;

@RequestMapping("/events")
@Controller
@RooWebScaffold(path = "events", formBackingObject = Event.class)
public class EventController {

	@RequestMapping(method = RequestMethod.GET, value = "/new", produces = "text/html")
	public String createPlayer(Model uiModel) {

		Event event = new Event();
		uiModel.addAttribute("event", event);
		return "event/createEvent";

	}

	@RequestMapping(value = "/new", method = RequestMethod.POST, produces = "text/html")
	public String saveEvent(Model uiModel, Event event, HttpServletRequest req) {
		eventSvc.saveEvent(event);
		String message = "thanks !!!!";
		return "redirect:/events/listevents?message=" + message;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/listevents", produces = "text/html")
	public String listPlayers(Model uiModel,
			@RequestParam(value = "message", required = false) String message) {

		if (!Utils.isEmpty(message)) {
			uiModel.addAttribute("message", message);
		}

		List<Event> events = eventSvc.findAllEvents();
		uiModel.addAttribute("events", events);
		return "events/listEvents";

	}

	@RequestMapping(method = RequestMethod.GET, value = "/edit/{id}", produces = "text/html")
	public String editEvent(@PathVariable("id")BigInteger id , Model uiModel) {

		
		Event event = eventSvc.findEvent(id);
		if(event == null){
			event = new Event();
		}
		
		uiModel.addAttribute("event", event);
		return "event/createEvent";
	}
	
}
