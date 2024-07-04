package com.gae.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gae.entity.SuggestionsEntity;

@Repository
public interface SuggestionRepository extends MongoRepository<SuggestionsEntity, String> {

}
