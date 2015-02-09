package com.darkhorse.getsporty.svc;

import com.darkhorse.getsporty.domain.User;


public class UserSvcImpl implements UserSvc {
	
	public User findByEmail(String email){
		return userDao.findByEmail(email);
	}
	
}
