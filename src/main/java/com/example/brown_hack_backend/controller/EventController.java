package com.example.brown_hack_backend.controller;

import com.example.brown_hack_backend.model.Event;
import com.example.brown_hack_backend.model.RecommendedEvents;
import com.example.brown_hack_backend.repository.EventRepository;
import com.example.brown_hack_backend.repository.RecommendedEventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/events")
@CrossOrigin(origins = {"http://127.0.0.1:5174", "http://localhost:5174"})
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private RecommendedEventsRepository recommendedEventsRepository;

    // Get all events
    @GetMapping("/all")
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    // ✅ API to fetch recommended events
    @GetMapping("/getrecommendedevents")
    public List<RecommendedEvents> getRecommendedEvents() {
        return recommendedEventsRepository.findAll();
    }

    // Get event by ID
    @GetMapping("/{id}")
    public ResponseEntity<?> getEventById(@PathVariable String id) {
        Optional<Event> event = eventRepository.findById(id);

        if (event.isPresent()) {
            return ResponseEntity.ok(event.get());
        } else {
            return ResponseEntity.status(404).body("Event not found");
        }
    }

    // Create an event and return the created event in response
    @PostMapping("/create")
    public ResponseEntity<Event> createEvent(@RequestBody Event eventRequest) {
        Event savedEvent = eventRepository.save(eventRequest);
        return ResponseEntity.ok(savedEvent);
    }
}

