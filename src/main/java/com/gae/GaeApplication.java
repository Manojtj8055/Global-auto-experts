package com.gae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GaeApplication {

	public static void main(String[] args) {

		SpringApplication.run(GaeApplication.class, args);

		System.out.println("Project Started ");
	}

}
