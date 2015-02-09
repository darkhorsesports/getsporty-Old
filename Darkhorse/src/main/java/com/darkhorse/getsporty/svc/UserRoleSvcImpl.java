package com.darkhorse.getsporty.svc;

import com.darkhorse.getsporty.domain.UserRole;


public class UserRoleSvcImpl implements UserRoleSvc {
	
	public UserRole findByCode(String code){
		return userRoleDao.findByCode(code);
		
	}
	
}
