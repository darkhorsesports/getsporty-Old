package com.darkhorse.getsporty.domain;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
public class Contact {
	
	private String mobileNo;
	
	private String landLineNo;
	
	private String alternateEmailId;
	
	private String alternateContactNo;
	
	/** Address fields*/
	
	private String laneNo;
	
	private String area;
	
	private String landMark;
	
	private String city;
	
	private String pincode;
	
	private String state;
	
	private String country;
	
}
