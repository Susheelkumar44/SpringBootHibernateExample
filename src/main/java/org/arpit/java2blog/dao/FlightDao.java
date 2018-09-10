package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Flights;


public interface FlightDao {
	 public List<Flights> getAllFlights() ;
	 public List<Flights> availableFlights(String source,String destination,String journeyDate);
	public boolean findBySource(String source);
	public boolean findByDestination(String destination);
}
