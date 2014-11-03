package com.darkhorse.getsporty.domain;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.web.multipart.MultipartFile;

@RooJavaBean
@RooToString
@RooMongoEntity
public class Image {
	
    @DBRef
    private User user;
	
	private String title;
	
	private String pathUrl;
	
	private String size;
	
	private String type;
	
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date created;
	
	private MultipartFile uploadFile;

	
}
