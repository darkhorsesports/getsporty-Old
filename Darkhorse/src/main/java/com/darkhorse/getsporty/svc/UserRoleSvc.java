package com.darkhorse.getsporty.svc;

import org.springframework.roo.addon.layers.service.RooService;

import com.darkhorse.getsporty.domain.UserRole;

@RooService(domainTypes = { com.darkhorse.getsporty.domain.UserRole.class })
public interface UserRoleSvc {
	
	UserRole findByCode(String code);
}
