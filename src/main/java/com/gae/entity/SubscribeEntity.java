package com.gae.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Subscribe")
public class SubscribeEntity {

	private String name;
	private String email;


}
