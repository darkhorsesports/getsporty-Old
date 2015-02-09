package com.darkhorse.getsporty.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.darkhorse.getsporty.domain.Contact;
import com.darkhorse.getsporty.domain.Player;
import com.darkhorse.getsporty.domain.User;
import com.darkhorse.getsporty.domain.UserRole;
import com.darkhorse.getsporty.svc.UserRoleSvc;
import com.darkhorse.getsporty.util.Utils;

/**
 * @author sanjeev
 *
 */
@RequestMapping("/players")
@Controller
@RooWebScaffold(path = "players", formBackingObject = Player.class)
public class PlayerController {

	@Autowired
	private UserRoleSvc userRoleSvc;

	@RequestMapping(method = RequestMethod.GET, value = "/createPlayer", produces = "text/html")
	public String createPlayer(Model uiModel) {

		Player player = new Player();

		uiModel.addAttribute("player", player);
		return "players/createPlayer";

	}

	@RequestMapping(value = "/createPlayer", method = RequestMethod.POST, produces = "text/html")
	public String saveProductDetail(
			Model uiModel,
			Player player,
			HttpServletRequest req,
			@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "password", required = false) String password,
			@RequestParam(value = "enable", required = false) boolean enable) {

		User user = null;
		if (!Utils.isEmailValid(email)) {
			uiModel.addAttribute("err", "Please enter valid email id. !!!");
			uiModel.addAttribute("name", name);
			uiModel.addAttribute("email", email);
			uiModel.addAttribute("player", player);
			return "players/createPlayer";
		}
		user = userSvc.findByEmail(email);
		if (user != null) {
			uiModel.addAttribute("err", "user with this mail id already exists !!!");
			uiModel.addAttribute("name", name);
			uiModel.addAttribute("email", email);
			uiModel.addAttribute("player", player);
			return "players/createPlayer";

		}
		if (user == null) {
			user = new User();
		}
		user.setEmail(email);
		user.setPasswd(password);
		user.setIsEnabled(enable);
		UserRole userRole = userRoleSvc.findByCode("Player");
		if (userRole == null) {
			uiModel.addAttribute("name", name);
			uiModel.addAttribute("email", email);
			uiModel.addAttribute("err", "There is no player Role Available !!!");
			uiModel.addAttribute("player", player);
			return "players/createPlayer";
		}
		Contact contact = player.getContact();
		List<UserRole> userRoles = new ArrayList<UserRole>();
		userRoles.add(userRole);
		user.setUserRoles(userRoles);
		userSvc.saveUser(user);
		player.setUser(user);
		if (contact != null) {
			player.setContact(contact);
		}
		playerSvc.savePlayer(player);
		String message = "New Player added successfuly !!!";
		
		return "redirect:/players/listPlayers?message=" + message;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/listPlayers", produces = "text/html")
	public String listPlayers(Model uiModel,
			@RequestParam(value = "message", required = false) String message) {

		if (!Utils.isEmpty(message)) {
			uiModel.addAttribute("message", message);
		}
		List<Player> players = playerSvc.findAllPlayers();
		uiModel.addAttribute("players", players);
		return "players/listPlayers";

	}
}
