package org.arpit.java2blog.service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.arpit.java2blog.dao.BookingDao;
import org.arpit.java2blog.dao.FlightDao;
import org.arpit.java2blog.model.Booking;
import org.arpit.java2blog.model.Flights;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service("bookingService")
public class BookingService {
	@Autowired
	BookingDao bookingDao;
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	
	public List<Flights> getFlight(int flightid) {
		return bookingDao.getFlight(flightid);
	}
}
