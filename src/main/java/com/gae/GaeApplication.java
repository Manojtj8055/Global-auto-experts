package com.gae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gae.entity.GaeEntity;

@SpringBootApplication
public class GaeApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(GaeApplication.class, args);

	//	GaeEntity ref = new GaeEntity();
		
		System.out.println("Project Started ");
	}

}
