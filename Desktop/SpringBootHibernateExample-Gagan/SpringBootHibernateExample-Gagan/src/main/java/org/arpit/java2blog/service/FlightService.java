package org.arpit.java2blog.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;


import org.arpit.java2blog.dao.FlightDao;
import org.arpit.java2blog.dao.FlightDaoImpl;
import org.arpit.java2blog.model.Customer;
import org.arpit.java2blog.model.Flights;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
	/*class FlightMapper implements RowMapper<Flights>{
		
		public Flights mapRow(ResultSet rs, int arg1) throws SQLException {
			Flights Flights = new Flights();
			
			Flights.setFlightid(rs.getInt("flightid"));
			Flights.setFlightName(rs.getString("flightname"));
			Flights.setSource(rs.getString("source"));
			Flights.setDestination(rs.getString("destination"));
			Flights.setArrival(rs.getString("arrival"));
			Flights.setDeparture(rs.getString("departure"));
			Flights.setDepartdate(rs.getString("departdate"));
			Flights.setPrice(rs.getDouble("price"));
			return Flights;
		}
	}	*/
	
}
