package com.mcnz.project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceGateway {
	
	@Autowired
	public EventsService eventService;
	
	@GetMapping("/loaddata")
	public void loaddata() {
		Event e1 = new Event("ABC","Concert","music concert");
		eventService.saveOrUpdate(e1);
	}
	
	@GetMapping("/events")
	public List<Event> findAllEvents() {
		return eventService.findAllEvents();
	}
	
	@GetMapping("/events/{id}")
	public Optional<Event> findEventById(@PathVariable String id) {
		return eventService.findEventById(id);
	}
	
	@DeleteMapping("/events/{id}")
	public void deleteEventById(@PathVariable String id) {
		eventService.deleteEventById(id);
	}
	
	@PostMapping("/events")
	public Event create(@RequestBody Event event) {
		event = eventService.saveOrUpdate(event);
		return event;
	}
	
	@PutMapping("/events/{id}")
	public Event update(@RequestBody Event event) {
		event = eventService.saveOrUpdate(event);
		return event;
	}
	
}
