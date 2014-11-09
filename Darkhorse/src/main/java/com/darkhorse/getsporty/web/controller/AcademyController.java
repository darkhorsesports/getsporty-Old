package com.darkhorse.getsporty.web.controller;

import com.darkhorse.getsporty.domain.Academy;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sanjeev
 *
 */
@RequestMapping("/academys")
@Controller
@RooWebScaffold(path = "academys", formBackingObject = Academy.class)
public class AcademyController {
}
