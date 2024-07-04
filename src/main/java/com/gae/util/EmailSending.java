package com.gae.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Level;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
public class EmailSending {
	
	 private static final Logger logger = LoggerFactory.getLogger(EmailSending.class);


	@Autowired
	private JavaMailSender sender;
	
	@Value("$(spring.mail.username=manutj805517@gmail.com)")
	private String fromEmail;

	public void sendEmailToCompany(String to, String subject, String text) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(to);
		mail.setText(text);
		mail.setFrom(fromEmail);
		mail.setSubject(subject);
		sender.send(mail);
		
		 try {
	            sender.send(mail);
	            logger.info("Email sent successfully to " + to);
	        } catch (Exception e) {
	            logger.error("Error sending email to " + to, e);
	        }
	}
	
	public void sendEmailCallbackRequest(String to, String subject, String text) {
		SimpleMailMessage request = new SimpleMailMessage();
		request.setTo(to);
		request.setText(text);
		request.setFrom("manoj805517@outlook.com");
		request.setSubject(subject);
		sender.send(request);
	}
	
	public void sendEmailSuggestion(String to, String subject, String text) {
		SimpleMailMessage request = new SimpleMailMessage();
		request.setTo(to);
		request.setText(text);
		request.setFrom("manoj805517@outlook.com");
		request.setSubject(subject);
		sender.send(request);
	}
	
	public void sendEmailParntersRequest(String to, String subject, String text) {
		SimpleMailMessage request = new SimpleMailMessage();
		request.setTo(to);
		request.setText(text);
		request.setFrom("manoj805517@outlook.com");
		request.setSubject(subject);
		sender.send(request);
	}
	
	public void sendEmailRefferal(String to, String subject, String text) {
		SimpleMailMessage request = new SimpleMailMessage();
		request.setTo(to);
		request.setText(text);
		request.setFrom("manoj805517@outlook.com");
		request.setSubject(subject);
		sender.send(request);
	}
	
	public void sendSubscriberDetails(String to, String subject, String text) {
		SimpleMailMessage request = new SimpleMailMessage();
		request.setTo(to);
		request.setText(text);
		request.setFrom("manoj805517@outlook.com");
		request.setSubject(subject);
		sender.send(request);
	}

}
