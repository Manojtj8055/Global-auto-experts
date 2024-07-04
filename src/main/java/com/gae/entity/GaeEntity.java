package com.gae.entity;

import java.time.LocalDate;

	import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Auto")
public class GaeEntity {

	@Id
	private String id;
	
	private String name;
	private String email;
	private Long phone;
	private String pincode;   //changed from address to pincode
	private LocalDate year;
	private String brand;
	private String model;
	
	private boolean termsAgreed;
	private String service;
	
	
}
