package com.gae.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.gae.entity.GaeEntity;
import com.gae.entity.PartnersEntity;
import com.gae.entity.RefferalEntity;
import com.gae.entity.ServiceRequestEntity;
import com.gae.entity.SubscribeEntity;
import com.gae.entity.SuggestionsEntity;
import com.gae.repository.GaeRepository;
import com.gae.repository.PartnersRepository;
import com.gae.repository.RefferalRepository;
import com.gae.repository.RequestRepository;
import com.gae.repository.SubscribeRepository;
import com.gae.repository.SuggestionRepository;

@Service
public class ServiceLayer {

	@Autowired
	private GaeRepository repository;
	
	@Autowired
	private RequestRepository reqRepo;
	
	@Autowired
	private SuggestionRepository suggestionRepository;
	
	@Autowired
	private PartnersRepository partnersRepository;
	
	@Autowired
	private RefferalRepository refRepo;
	
	@Autowired
	private SubscribeRepository subRepo;
	
	public GaeEntity saveData(GaeEntity entity) {
		return repository.save(entity);
		
	}
	
	public ServiceRequestEntity saveRequests(ServiceRequestEntity request) {
		return reqRepo.save(request);
		
	}
	
	public SuggestionsEntity saveSuggestions(SuggestionsEntity suggestions) {
		return suggestionRepository.save(suggestions);
	}
	
	public PartnersEntity savePartners(PartnersEntity partners) {
		return partnersRepository.save(partners);
		
	}
	
	public RefferalEntity saveRefferal(RefferalEntity refferalEntity) {
		return refRepo.save(refferalEntity);
		
	}
	
	public SubscribeEntity saveSubscribers(SubscribeEntity subscribe) {
		Optional<SubscribeEntity> existingSubscriber = subRepo.findByEmail(subscribe.getEmail());
		if(existingSubscriber.isPresent()) {
			 throw new DataIntegrityViolationException("Email already exists");

		}
		return subRepo.save(subscribe);
	}
}
