package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Flights;


	public interface BookingDao {
		public List<Flights> getFlight(int flightid);
	
}

