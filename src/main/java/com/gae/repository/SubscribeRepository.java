package com.gae.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gae.entity.SubscribeEntity;

@Repository
public interface SubscribeRepository extends MongoRepository<SubscribeEntity, String>{

	Optional<SubscribeEntity> findByEmail(String Email); 
}
