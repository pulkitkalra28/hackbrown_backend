package com.example.brown_hack_backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.math.BigDecimal;

@Data
@Document(collection = "events")
public class Event {
    @Id
    private String id;  // MongoDB will generate an ObjectId

    private String artistId;
    private String title;
    private String category;
    private String eventType;
    private String startDate;
    private String endDate;
    private String startTime;
    private String endTime;
    private String description;
    private String city;
    private String venue;

    private String ticketType;
    private String ticketName;
    private BigDecimal ticketPrice;
    private int ticketQuantity;
    private String ticketInfo;
    private boolean ticketEnabled;
    private String ticketStatus;

    private String salesStart;
    private String salesEnd;
}
