package com.example.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Event {
    @Id
    private int eventId;
    private String eventName;
    private String location;
    private String date;
    private String startTime;
    private String endTime;
}
