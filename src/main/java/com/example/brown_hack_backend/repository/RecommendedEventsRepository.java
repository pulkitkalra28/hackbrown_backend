package com.example.brown_hack_backend.repository;

import com.example.brown_hack_backend.model.RecommendedEvents;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecommendedEventsRepository extends MongoRepository<RecommendedEvents, String> {

}
