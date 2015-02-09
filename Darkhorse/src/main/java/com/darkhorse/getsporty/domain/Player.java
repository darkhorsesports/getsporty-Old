package com.darkhorse.getsporty.domain;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

/**
 * @author sanjeev
 *
 */
@RooJavaBean
@RooToString
@RooMongoEntity
public class Player extends CommonFields {
	
	private enum PlayerLevel {
		
		Bigner,Intermediate,Professionl
	}
	

    @DBRef
    private User user;

    private Date DOB;
	
	private List<String> typeOfIntrest;
	
	private Map<String, String> qulification;
	
	private List<String> careerHeighlights;
	
	private List<String> hobbiesAndIntrest;
	
	private PlayerLevel playerLevel;

	
}
