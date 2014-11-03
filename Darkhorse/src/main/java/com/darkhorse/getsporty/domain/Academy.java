package com.darkhorse.getsporty.domain;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
public class Academy {
	
    @DBRef
    private User user;

	private List<String> facilityAvailable;
	
	private List<String> faculityAvailable;
	
	private List<String> timeSlotAvailable;
	
	private List<String> sourceAvailable;

	
}
