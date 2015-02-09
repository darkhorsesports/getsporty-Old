package com.darkhorse.getsporty.web.controller.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author sanjeev
 */
@Controller
@RequestMapping("/gsapi")
public class RestApiController {

    @Autowired
    private com.darkhorse.getsporty.svc.UserSvc userSvc;
    
    @RequestMapping(value = "user", headers = "Accept=application/json", method=RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> userPost(@RequestParam(value="passwd", required=false)String password,
	    @RequestParam(value="email", required=false)String email,
	    @RequestParam(value="deviceId", required=false)String deviceId,
	    HttpServletRequest request) {
	String message = "";
	com.darkhorse.getsporty.domain.User user = userSvc.findByEmail(email);
	if (user == null) {
	    message = "No user exists with this emailid.";
	    return new ResponseEntity<String>(message, HttpStatus.BAD_REQUEST);
	} else {
	    message = "success !!!";
	    return new ResponseEntity<String>(message, HttpStatus.OK);

	    }

    }
    
 
}
