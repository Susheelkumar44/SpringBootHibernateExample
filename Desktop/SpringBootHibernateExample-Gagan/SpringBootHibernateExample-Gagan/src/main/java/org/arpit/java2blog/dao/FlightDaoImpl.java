package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Flights;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class FlightDaoImpl implements FlightDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf1) {
		this.sessionFactory = sf1;
	}
	@Transactional
	public List<Flights> getAllFlights() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Flights>  flightList = session.createQuery("from Flights").list();
		System.out.println(flightList);
		return flightList;
	}
}