package com.darkhorse.getsporty.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.darkhorse.getsporty.domain.Player;

/**
 * @author sanjeev
 *
 */
@RequestMapping("/players")
@Controller
@RooWebScaffold(path = "players", formBackingObject = Player.class)
public class PlayerController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/createPlayer", produces = "text/html")
    public String createPlayer(Model uiModel) {

	Player player = new Player();
	
	uiModel.addAttribute("player", player);
	return "players/createPlayer";
	
    }

    @RequestMapping(value = "/createPlayer", method = RequestMethod.POST, produces = "text/html")
    public String saveProductDetail(Model uiModel, Player player, HttpServletRequest req,
    		@RequestParam(value = "name", required = false) String name,
    		@RequestParam(value = "email", required = false) String email,
    		@RequestParam(value = "password", required = false) String password,
    		@RequestParam(value = "enable", required = false) boolean enable) {

    System.out.println("Success");
    System.out.println(player);
    uiModel.addAttribute("success", "successful");
	return "redirect:/palyers";
    }
	
}
