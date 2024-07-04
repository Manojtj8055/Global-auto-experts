package com.gae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gae.entity.RefferalEntity;

@Repository
public interface RefferalRepository extends MongoRepository<RefferalEntity,String>{

}
