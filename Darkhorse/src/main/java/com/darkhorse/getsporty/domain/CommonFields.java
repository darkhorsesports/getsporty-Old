package com.darkhorse.getsporty.domain;

import java.util.List;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooMongoEntity
public class CommonFields {
	
	private enum Visibility{
		PUBLIC,PRIVATE
	}
	
	private String about;
	
	private Contact contact;
	
	private Image profileImage;
	
	private List<Image> gallery;
	
	private Visibility visibility = Visibility.PUBLIC;
	
	private List<String> profileLinks;

	private List<String> experience;

}
