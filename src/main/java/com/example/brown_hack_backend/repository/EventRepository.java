package com.example.brown_hack_backend.repository;

import com.example.brown_hack_backend.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {

}

