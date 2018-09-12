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
public class BookingDaoImpl implements BookingDao{
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf1) {
		this.sessionFactory = sf1;
	}
	@Transactional
	public List<Flights> getFlight(int flightid) {
		Session session = this.sessionFactory.getCurrentSession();
		List<Flights> bookedList = session.createQuery("from Flights where flightId= '"+flightid+"'").list();
		System.out.println(flightid);
		System.out.println(bookedList);
		return bookedList;
	}
}
