package com.gae;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gae.entity.GaeEntity;
import com.gae.entity.PartnersEntity;
import com.gae.entity.RefferalEntity;
import com.gae.entity.ServiceRequestEntity;
import com.gae.entity.SubscribeEntity;
import com.gae.entity.SuggestionsEntity;
import com.gae.repository.GaeRepository;
import com.gae.service.ServiceLayer;
import com.gae.util.EmailSending;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:8083" })
@RestController
@RequestMapping("/api")
public class MainController {

	private static final Logger log = LoggerFactory.getLogger(MainController.class);

	@Autowired
	private GaeRepository repo;

	@Autowired
	private ServiceLayer service;

	@Autowired
	private EmailSending sending;

	@GetMapping("/get")
	public String getValue(@RequestBody SubscribeEntity entity) {

		return entity.getName();

	}

	@PostMapping("/air")
	public GaeEntity airConditioningToDatabase(@RequestBody GaeEntity entity, Model model) {
		log.debug("Handling post request for api/air");
		if (entity != null) {

			GaeEntity savedEntity = service.saveData(entity);

			String to = "bhavanaakki707@gmail.com";
			String subject = "New Air Conditioning Service Request";
			String text = "A new service request has been made. Details:\n" + "Name: " + savedEntity.getName() + "\n"
					+ "Email: " + savedEntity.getEmail() + "\n" + "Phone: " + savedEntity.getPhone() + "\n"
					+ "Pincode: " + savedEntity.getPincode() + "\n" + "Brand: " + savedEntity.getBrand() + "\n"
					+ "Model: " + savedEntity.getModel() + "\n" + "Service: " + savedEntity.getService();

			sending.sendEmailToCompany(to, subject, text);
			model.addAttribute("Sent", "Booked Successfully");

			return savedEntity;

		}
		return entity;

	}

	@PostMapping("/battery")
	public GaeEntity batteryToDatabase(@RequestBody GaeEntity entity, Model model) {
		log.debug("Handling post request for api/battery");
		if (entity != null) {

			GaeEntity savedEntity = service.saveData(entity);

			String to = "bhavanaakki707@gmail.com";
			String subject = "New Battery Replacement Conditioning Service Request";
			String text = "A new service request has been made. Details:\n" + "Name: " + savedEntity.getName() + "\n"
					+ "Email: " + savedEntity.getEmail() + "\n" + "Phone: " + savedEntity.getPhone() + "\n"
					+ "Pincode: " + savedEntity.getPincode() + "\n" + "Brand: " + savedEntity.getBrand() + "\n"
					+ "Model: " + savedEntity.getModel() + "\n" + "Service: " + savedEntity.getService();

			sending.sendEmailToCompany(to, subject, text);
			model.addAttribute("Sent", "Booked Successfully");

			return savedEntity;

		}
		return entity;

	}

	@PostMapping("/periodic")
	public GaeEntity periodicToDatabase(@RequestBody GaeEntity entity, Model model) {
		log.debug("Handling post request for api/periodic");
		if (entity != null) {

			GaeEntity savedEntity = service.saveData(entity);

			String to = "manojtj.xworkz@gmail.com";
			String subject = "New Periodic Maintenance Conditioning Service Request";
			String text = "A new service request has been made. Details:\n" + "Name: " + savedEntity.getName() + "\n"
					+ "Email: " + savedEntity.getEmail() + "\n" + "Phone: " + savedEntity.getPhone() + "\n"
					+ "Pincode: " + savedEntity.getPincode() + "\n" + "Brand: " + savedEntity.getBrand() + "\n"
					+ "Model: " + savedEntity.getModel() + "\n" + "Service: " + savedEntity.getService();

			sending.sendEmailToCompany(to, subject, text);
			model.addAttribute("Sent", "Booked Successfully");

			return savedEntity;

		}
		return entity;

	}

	@PostMapping("/oil")
	public GaeEntity oilFilterToDatabase(@RequestBody GaeEntity entity, Model model) {
		log.debug("Handling post request for api/oil");
		if (entity != null) {

			GaeEntity savedEntity = service.saveData(entity);

			String to = "manojtj.xworkz@gmail.com";
			String subject = "New Oil & Filter Service Request";
			String text = "A new service request has been made. Details:\n" + "Name: " + savedEntity.getName() + "\n"
					+ "Email: " + savedEntity.getEmail() + "\n" + "Phone: " + savedEntity.getPhone() + "\n"
					+ "Pincode: " + savedEntity.getPincode() + "\n" + "Brand: " + savedEntity.getBrand() + "\n"
					+ "Model: " + savedEntity.getModel() + "\n" + "Service: " + savedEntity.getService();

			sending.sendEmailToCompany(to, subject, text);
			model.addAttribute("Sent", "Booked Successfully");

			return savedEntity;

		}
		return entity;

	}

	@PostMapping("/brake")
	public GaeEntity brakeServicesToDatabase(@RequestBody GaeEntity entity, Model model) {
		log.debug("Handling post request for api/brake");
		if (entity != null) {

			GaeEntity savedEntity = service.saveData(entity);

			String to = "manojtj.xworkz@gmail.com";
			String subject = "New Brake Services Request";
			String text = "A new service request has been made. Details:\n" + "Name: " + savedEntity.getName() + "\n"
					+ "Email: " + savedEntity.getEmail() + "\n" + "Phone: " + savedEntity.getPhone() + "\n"
					+ "Pincode: " + savedEntity.getPincode() + "\n" + "Brand: " + savedEntity.getBrand() + "\n"
					+ "Model: " + savedEntity.getModel() + "\n" + "Service: " + savedEntity.getService();

			sending.sendEmailToCompany(to, subject, text);
			model.addAttribute("Sent", "Booked Successfully");

			return savedEntity;

		}
		return entity;

	}

	@PostMapping("/batteryjump")
	public GaeEntity batteryJumpToDatabase(@RequestBody GaeEntity entity, Model model) {
		log.debug("Handling post request for api/batteryjump");
		if (entity != null) {

			GaeEntity savedEntity = service.saveData(entity);

			String to = "manojtj.xworkz@gmail.com";
			String subject = "New Battery Jump Service Request";
			String text = "A new service request has been made. Details:\n" + "Name: " + savedEntity.getName() + "\n"
					+ "Email: " + savedEntity.getEmail() + "\n" + "Phone: " + savedEntity.getPhone() + "\n"
					+ "Pincode: " + savedEntity.getPincode() + "\n" + "Brand: " + savedEntity.getBrand() + "\n"
					+ "Model: " + savedEntity.getModel() + "\n" + "Service: " + savedEntity.getService();

			sending.sendEmailToCompany(to, subject, text);
			model.addAttribute("Sent", "Booked Successfully");

			return savedEntity;

		}
		return entity;

	}

	@PostMapping("/emergency")
	public GaeEntity emergencyFuelToDatabase(@RequestBody GaeEntity entity, Model model) {
		log.debug("Handling post request for api/emergency");
		if (entity != null) {

			GaeEntity savedEntity = service.saveData(entity);

			String to = "manojtj.xworkz@gmail.com";
			String subject = "New Emergency Fuel Service Request";
			String text = "A new service request has been made. Details:\n" + "Name: " + savedEntity.getName() + "\n"
					+ "Email: " + savedEntity.getEmail() + "\n" + "Phone: " + savedEntity.getPhone() + "\n"
					+ "Pincode: " + savedEntity.getPincode() + "\n" + "Brand: " + savedEntity.getBrand() + "\n"
					+ "Model: " + savedEntity.getModel() + "\n" + "Service: " + savedEntity.getService();

			sending.sendEmailToCompany(to, subject, text);
			model.addAttribute("Sent", "Booked Successfully");

			return savedEntity;

		}
		return entity;

	}

	@PostMapping("/key")
	public GaeEntity keyRepairToDatabase(@RequestBody GaeEntity entity, Model model) {
		log.debug("Handling post request for api/key");
		if (entity != null) {

			GaeEntity savedEntity = service.saveData(entity);

			String to = "manojtj.xworkz@gmail.com";
			String subject = "New Key Repair Service Request";
			String text = "A new service request has been made. Details:\n" + "Name: " + savedEntity.getName() + "\n"
					+ "Email: " + savedEntity.getEmail() + "\n" + "Phone: " + savedEntity.getPhone() + "\n"
					+ "Pincode: " + savedEntity.getPincode() + "\n" + "Brand: " + savedEntity.getBrand() + "\n"
					+ "Model: " + savedEntity.getModel() + "\n" + "Service: " + savedEntity.getService();

			sending.sendEmailToCompany(to, subject, text);
			model.addAttribute("Sent", "Booked Successfully");

			return savedEntity;

		}
		return entity;

	}

	@PostMapping("/minor")
	public GaeEntity minorRepairToDatabase(@RequestBody GaeEntity entity, Model model) {
		log.debug("Handling post request for api/minor");
		if (entity != null) {

			GaeEntity savedEntity = service.saveData(entity);

			String to = "manojtj.xworkz@gmail.com";
			String subject = "New Minor Repair Service Request";
			String text = "A new service request has been made. Details:\n" + "Name: " + savedEntity.getName() + "\n"
					+ "Email: " + savedEntity.getEmail() + "\n" + "Phone: " + savedEntity.getPhone() + "\n"
					+ "Pincode: " + savedEntity.getPincode() + "\n" + "Brand: " + savedEntity.getBrand() + "\n"
					+ "Model: " + savedEntity.getModel() + "\n" + "Service: " + savedEntity.getService();

			sending.sendEmailToCompany(to, subject, text);
			model.addAttribute("Sent", "Booked Successfully");

			return savedEntity;

		}
		return entity;

	}

	@PostMapping("/puncture")
	public GaeEntity punctureToDatabase(@RequestBody GaeEntity entity, Model model) {
		log.debug("Handling post request for api/puncture");
		if (entity != null) {

			GaeEntity savedEntity = service.saveData(entity);

			String to = "manojtj.xworkz@gmail.com";
			String subject = "New Puncture Service Request";
			String text = "A new service request has been made. Details:\n" + "Name: " + savedEntity.getName() + "\n"
					+ "Email: " + savedEntity.getEmail() + "\n" + "Phone: " + savedEntity.getPhone() + "\n"
					+ "Pincode: " + savedEntity.getPincode() + "\n" + "Brand: " + savedEntity.getBrand() + "\n"
					+ "Model: " + savedEntity.getModel() + "\n" + "Service: " + savedEntity.getService();

			sending.sendEmailToCompany(to, subject, text);
			model.addAttribute("Sent", "Booked Successfully");

			return savedEntity;

		}
		return entity;

	}

	@PostMapping("/detailing")
	public GaeEntity carDetailingToDatabase(@RequestBody GaeEntity entity, Model model) {
		log.debug("Handling post request for api/detailing");
		if (entity != null) {

			GaeEntity savedEntity = service.saveData(entity);

			String to = "manojtj.xworkz@gmail.com";
			String subject = "New Car Detailing Service Request";
			String text = "A new service request has been made. Details:\n" + "Name: " + savedEntity.getName() + "\n"
					+ "Email: " + savedEntity.getEmail() + "\n" + "Phone: " + savedEntity.getPhone() + "\n"
					+ "Pincode: " + savedEntity.getPincode() + "\n" + "Brand: " + savedEntity.getBrand() + "\n"
					+ "Model: " + savedEntity.getModel() + "\n" + "Service: " + savedEntity.getService();

			sending.sendEmailToCompany(to, subject, text);
			model.addAttribute("Sent", "Booked Successfully");

			return savedEntity;

		}
		return entity;

	}

	@PostMapping("/wash")
	public GaeEntity carWashToDatabase(@RequestBody GaeEntity entity, Model model) {
		log.debug("Handling post request for api/wash");
		if (entity != null) {

			GaeEntity savedEntity = service.saveData(entity);

			String to = "manojtj.xworkz@gmail.com";
			String subject = "New Car Wash Service Request";
			String text = "A new service request has been made. Details:\n" + "Name: " + savedEntity.getName() + "\n"
					+ "Email: " + savedEntity.getEmail() + "\n" + "Phone: " + savedEntity.getPhone() + "\n"
					+ "Pincode: " + savedEntity.getPincode() + "\n" + "Brand: " + savedEntity.getBrand() + "\n"
					+ "Model: " + savedEntity.getModel() + "\n" + "Service: " + savedEntity.getService();

			sending.sendEmailToCompany(to, subject, text);
			model.addAttribute("Sent", "Booked Successfully");

			return savedEntity;

		}
		return entity;

	}

	@PostMapping("/spa")
	public GaeEntity deepSpaToDatabase(@RequestBody GaeEntity entity, Model model) {
		log.debug("Handling post request for api/spa");
		if (entity != null) {

			GaeEntity savedEntity = service.saveData(entity);

			String to = "manojtj.xworkz@gmail.com";
			String subject = "New Deep Spa Service Request";
			String text = "A new service request has been made. Details:\n" + "Name: " + savedEntity.getName() + "\n"
					+ "Email: " + savedEntity.getEmail() + "\n" + "Phone: " + savedEntity.getPhone() + "\n"
					+ "Pincode: " + savedEntity.getPincode() + "\n" + "Brand: " + savedEntity.getBrand() + "\n"
					+ "Model: " + savedEntity.getModel() + "\n" + "Service: " + savedEntity.getService();

			sending.sendEmailToCompany(to, subject, text);
			model.addAttribute("Sent", "Booked Successfully");

			return savedEntity;

		}
		return entity;

	}

	@PostMapping("/interior")
	public GaeEntity interiorCleaningToDatabase(@RequestBody GaeEntity entity, Model model) {
		log.debug("Handling post request for api/interior");
		if (entity != null) {

			GaeEntity savedEntity = service.saveData(entity);

			String to = "manojtj.xworkz@gmail.com";
			String subject = "New Interior Cleaning Service Request";
			String text = "A new service request has been made. Details:\n" + "Name: " + savedEntity.getName() + "\n"
					+ "Email: " + savedEntity.getEmail() + "\n" + "Phone: " + savedEntity.getPhone() + "\n"
					+ "Pincode: " + savedEntity.getPincode() + "\n" + "Brand: " + savedEntity.getBrand() + "\n"
					+ "Model: " + savedEntity.getModel() + "\n" + "Service: " + savedEntity.getService();

			sending.sendEmailToCompany(to, subject, text);
			model.addAttribute("Sent", "Booked Successfully");

			return savedEntity;

		}
		return entity;

	}

	@PostMapping("/callBack")
	public ServiceRequestEntity requestToDatabase(@RequestBody ServiceRequestEntity requestEntity, Model model) {
		log.debug("Handling post request for api/callBack");
		if (requestEntity != null) {

			ServiceRequestEntity requestSaved = service.saveRequests(requestEntity);

			String to = "manojtj.xworkz@gmail.com";
			String subject = "New Callback Request";
			String text = "A new call back request has been made. Details:\n" + "Name : " + requestEntity.getName()
					+ "\n" + "PhoneNumber: " + requestSaved.getMobile();

			sending.sendEmailCallbackRequest(to, subject, text);
			model.addAttribute("requestcallback", "Requsted Call Back");
			return requestSaved;
		}
		return requestEntity;
	}

	@PostMapping("/suggest")
	public SuggestionsEntity suggestionsToDatabase(@RequestBody SuggestionsEntity suggestEntity) {
		log.debug("Handling post request for api/suggest");
		if (suggestEntity != null) {

			SuggestionsEntity suggestionSaved = service.saveSuggestions(suggestEntity);

			String to = "manojtj.xworkz@gmail.com";
			String subject = "New Suggestions";
			String text = "We are pleased to inform you that a new suggestion has been submitted through our website form. Below are the details of the submission:\r\n"
					+ "Name: " + suggestionSaved.getName() + "\n" + "Email Address: " + suggestionSaved.getEmail()
					+ "\n" + "Phone Number: " + suggestionSaved.getPhone() + "\n" + "Suggestion:\n"
					+ suggestionSaved.getSuggestions() + "\n"
					+ "Please review the provided information and take the necessary actions to address the suggestion.\r\n"
					+ "Thank you for your attention.";

			sending.sendEmailSuggestion(to, subject, text);

			return suggestionSaved;
		}
		return suggestEntity;
	}

	@PostMapping("/partner")
	public PartnersEntity partnersRequestToDatabase(@RequestBody PartnersEntity partnersEntity) {
		log.debug("Handling post request for api/partner");
		if (partnersEntity != null) {
			PartnersEntity savedPartners = service.savePartners(partnersEntity); // Save the received data

			String to = "manojtj.xworkz@gmail.com";
			String subject = "Partnership Request";
			String text = "Dear Team,\r\n" + "\r\n"
					+ "We are pleased to inform you that a new individual has expressed interest in partnering with us. Below are the details of the potential partner:\r\n"
					+ "\r\n" + "- *Workshop Type:* " + savedPartners.getWorkshoptype() + "\n"
					+ "- *Contact Person Name:* " + savedPartners.getContactpersonname() + "\n" + "- *Mobile Number:* "
					+ savedPartners.getPhone() + "\n" + "- *Locality:* " + savedPartners.getLocality() + "\n"
					+ "- *Workshop Name:* " + savedPartners.getWorkshopname() + "\n" + "\r\n"
					+ "We kindly request you to reach out to the contact person at your earliest convenience to discuss this potential partnership further.\r\n"
					+ "Best regards,\r\n" + "\r\n" + savedPartners.getWorkshopname() + "\r\n" + "\r\n"
					+ "---------------------------------------------------\r\n"
					+ "This email contains confidential information and is intended solely for the use of the individual or entity to whom it is addressed. If you are not the intended recipient, please notify the sender immediately and delete this email from your system. Unauthorized disclosure, copying, or distribution of this email or any part of its contents is prohibited.\r\n"
					+ "---------------------------------------------------";

			sending.sendEmailParntersRequest(to, subject, text);

			return savedPartners;
		}
		return partnersEntity;
	}

	@PostMapping("/refer")
	public RefferalEntity refferalRequestToDatabase(@RequestBody RefferalEntity refEntity) {
		log.debug("Handling post request for api/refer");
		if (refEntity != null) {
			RefferalEntity savedRefferal = service.saveRefferal(refEntity); // Save the received data

			String to = "manojtj.xworkz@gmail.com";
			String subject = "Refferal Request";
			String text = "Dear Team,\r\n" + "\r\n" + "I hope this email finds you well.\r\n" + "\r\n"
					+ "I am writing to refer a friend for a subscription to our company's website. I believe that "
					+ savedRefferal.getFriendName()
					+ " would greatly benefit from and enjoy the content and services provided on our platform.\r\n"
					+ "\r\n" + "Referrer Details:\r\n" + "\r\n" + "Name: " + savedRefferal.getReferrerName() + " \n"
					+ "Contact Information: " + savedRefferal.getReferrerEmail() + "\n"

					+ "Referred Friend's Details:\r\n" + "\r\n" + "Name: " + savedRefferal.getFriendName() + " \n"
					+ "Contact Information: " + savedRefferal.getFriendEmail() + "\n";

			sending.sendEmailRefferal(to, subject, text);

			return savedRefferal;
		}
		return refEntity;
	}

	@PostMapping("/subscribe")
	public SubscribeEntity subscribersToDatabase(@RequestBody SubscribeEntity subscribeEntity) {
		log.debug("Handling post request for api/subscribe");

		if (subscribeEntity != null) {
			SubscribeEntity subEntity = service.saveSubscribers(subscribeEntity);
			
			log.debug("issue is here mail problem from server");
			
			String to = "manojtj.xworkz@gmail.com";
			String subject = "New Subscriber";
			String text = "Dear Team, \r\n" + "\r\n" + "There's a new Subscriber \r\n " + "\r\n"
					+ "Contact Details :- \r\n" + "\r\n" + "Name : " + subEntity.getName() + " \n" + "Email :"
					+ subEntity.getEmail() + " \n";

			sending.sendSubscriberDetails(to, subject, text);

			return subEntity;
		}

		return subscribeEntity;
	}

	@PostMapping("/test")
	public ResponseEntity<String> testPostMapping(@RequestBody Map<String, Object> requestBody) {
		log.debug("Handling post request for api/test");
		// Log the request payload (optional)
		System.out.println("Received request: " + requestBody.toString());

		// Check if the 'name' field is present in the request body
		if (requestBody.containsKey("name")) {
			String name = requestBody.get("name").toString();
			return ResponseEntity.ok("Request received successfully, name: " + name);
		}

		// Return a simple response if 'name' is not present
		return ResponseEntity.ok("Request received successfully");
	}

}
