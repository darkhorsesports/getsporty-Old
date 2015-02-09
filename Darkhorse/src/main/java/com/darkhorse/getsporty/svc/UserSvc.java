package com.darkhorse.getsporty.svc;

import org.springframework.roo.addon.layers.service.RooService;

import com.darkhorse.getsporty.domain.User;

@RooService(domainTypes = { com.darkhorse.getsporty.domain.User.class })
public interface UserSvc {
	
	User findByEmail(String email);
	
}
