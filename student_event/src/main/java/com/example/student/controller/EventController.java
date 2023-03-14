package com.example.student.controller;

import com.example.student.model.Event;
import com.example.student.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Event")
public class EventController {

    @Autowired
    EventService eventService;

    @GetMapping(value = "all" )
    public List<Event> getAllEvents(){
        return eventService.getAll();
    }

    @PostMapping("add")
    public String addEvent(Event event){
        return eventService.addEvent(event);
    }

    @PutMapping("update/{id}")
    public String updateEvent(@PathVariable String id , @RequestBody Event event){
        return eventService.updateevent(id , event);
    }





}
