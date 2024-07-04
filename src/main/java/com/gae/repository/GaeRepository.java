package com.gae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gae.entity.GaeEntity;

public interface GaeRepository extends MongoRepository<GaeEntity, String>{

}
