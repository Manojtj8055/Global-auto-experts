package com.gae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gae.entity.PartnersEntity;

public interface PartnersRepository extends MongoRepository<PartnersEntity, String> {

}
