package com.darkhorse.getsporty.web.controller;

import com.darkhorse.getsporty.domain.UserRole;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebJson(jsonObject = UserRole.class)
@Controller
@RequestMapping("/userroles")
@RooWebScaffold(path = "userroles", formBackingObject = UserRole.class)
public class UserRoleController {
}
