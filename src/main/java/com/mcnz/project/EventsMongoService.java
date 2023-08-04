package com.mcnz.project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventsMongoService implements EventsService {
	
	@Autowired
	EventsMongoRepository repo;
	
	@Override
	public void loadData() {
		Event event1 = new Event("abc", "Cars and coffee", "Fun Event");
		Event event2 = new Event("def", "Taylor", "hahaha");
		Event event3 = new Event("Whatever","Muse","Gogogo");
		repo.save(event1);
		repo.save(event2);
		repo.save(event3);
	}
	
	
	@Override
	public Optional<Event> findEventById(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public void deleteEventById(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public List<Event> findAllEvents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Event saveOrUpdate(Event event) {
		// TODO Auto-generated method stub
		return repo.save(event);
	}

}
