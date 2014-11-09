package com.darkhorse.getsporty.web.controller;

import com.darkhorse.getsporty.domain.User;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sanjeev
 *
 */
@RooWebJson(jsonObject = User.class)
@Controller
@RequestMapping("/users")
@RooWebScaffold(path = "users", formBackingObject = User.class)
public class UserController {
}
