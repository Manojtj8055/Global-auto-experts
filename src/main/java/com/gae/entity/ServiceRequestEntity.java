package com.gae.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Document("CallbackRequest")
public class ServiceRequestEntity {
	
	@Id
	private String Id;
	private String name;
	private String mobile; 

}
