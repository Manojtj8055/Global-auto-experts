package com.gae.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Partners")
public class PartnersEntity {
	
	private String workshoptype;
	private String contactpersonname;
	private String phone;
	private String locality;
	private String workshopname;
	
	

}
