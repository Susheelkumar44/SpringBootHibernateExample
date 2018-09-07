package org.arpit.java2blog.service;

import java.util.List;

import javax.sql.DataSource;

import org.arpit.java2blog.dao.FlightDao;
import org.arpit.java2blog.model.Flights;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service("flightService")
public class FlightService {
	
	@Autowired
	FlightDao flightDao;
	
       @Autowired
       DataSource dataSource;
       
       @Autowired
       JdbcTemplate jdbcTemplate;

       public List<Flights> getAllFlights() {
              return flightDao.getAllFlights();
       }
}
