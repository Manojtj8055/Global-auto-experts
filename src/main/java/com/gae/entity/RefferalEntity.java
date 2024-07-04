package com.gae.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Refer")
public class RefferalEntity {
	
	private String referrerName;
	private String referrerEmail;
	private String friendName;
	private String friendEmail;
	
	

}
