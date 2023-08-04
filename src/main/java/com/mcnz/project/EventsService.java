package com.mcnz.project;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

public interface EventsService {

	void loadData();

	Optional<Event> findEventById(String id);

	void deleteEventById(String id);

	List<Event> findAllEvents();

	Event saveOrUpdate(Event event);

}