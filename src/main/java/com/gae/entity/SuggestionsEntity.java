package com.gae.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection =  "Suggestions")
public class SuggestionsEntity {
	
	
	
	private String name;
	private String phone;
	private String email;
	private String suggestions;
}
