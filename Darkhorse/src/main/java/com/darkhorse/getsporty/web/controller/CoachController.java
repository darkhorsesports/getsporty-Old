package com.darkhorse.getsporty.web.controller;

import com.darkhorse.getsporty.domain.Coach;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/coaches")
@Controller
@RooWebScaffold(path = "coaches", formBackingObject = Coach.class)
public class CoachController {
}
