package com.gae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gae.entity.ServiceRequestEntity;

public interface RequestRepository extends MongoRepository<ServiceRequestEntity, String> {

}
