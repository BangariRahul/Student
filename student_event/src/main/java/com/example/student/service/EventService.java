package com.example.student.service;

import com.example.student.model.Event;
import com.example.student.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
@Autowired
    EventRepository eventRepository;
    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    public String addEvent(Event event) {
        eventRepository.save(event);
        return "Event added";
    }

    public String updateevent(String id, Event event) {
        List<Event> events = eventRepository.findAll();

        for(Event e : events){
            if(e.getEventId()== Integer.valueOf(id)){
                e.setEventName(event.getEventName());
                e.setDate(event.getDate());
                e.setLocation(event.getLocation());
                e.setStartTime(event.getStartTime());
                e.setEndTime(event.getEndTime());
            }
        }
        return "EventUpdated";

    }
}
