package com.darkhorse.getsporty.domain;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
public class Coach extends CommonFields {
	
	private enum Level{
		
		Bigner,Intermediate,Professionl
	}
	
    @DBRef
    private User user;

	private Date DOB;
	
	private Level playerLevel;
	
	private List<String> workingArea;
	
	@DBRef
	private Academy assosiatedWithAcademy;


}
