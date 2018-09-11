package org.arpit.java2blog.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.arpit.java2blog.dao.CustomerDao;
import org.arpit.java2blog.model.Customer;
import org.arpit.java2blog.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;


@Service("customerService")
public class CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Transactional
	public List<Customer> getAllCustomers() {
		return customerDao.getAllCustomers();
	}

	@Transactional
	public Customer getCustomer(int id) {
		return customerDao.getCustomer(id);
	}

	@Transactional
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	@Transactional
	public void updateCustomer(Customer customer) {
		((CustomerService) customerDao).updateCustomer(customer);

	}

	@Transactional
	public void deleteCustomer(int id) {
		((CustomerService) customerDao).deleteCustomer(id);
	}

	public Customer validateCustomer(Login login) {
		String sql = "select * from customer where email='" + login.getEmail() + "' and password='" + login.getPassword() + "'";
		List<Customer> customers = jdbcTemplate.query(sql, new CustomerMapper());
		System.out.println(customers.size() > 0 ? customers.get(0) : null);
		return customers.size() > 0 ? customers.get(0) : null;
	}
}

class CustomerMapper implements RowMapper<Customer>{
	
	public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
		Customer customer = new Customer();
		
		customer.setCustomerName(rs.getString("customername"));
		customer.setEmail(rs.getString("email"));
		customer.setPassword(rs.getString("password"));
		
		return customer;
	}
	//insert into flights values ('mysore','bangalore',to_date('11-09-2018','dd-mm-yyyy'),500,to_date('18:00','hh24:mi'),10,'air india',to_date('17:00','hh24:mi'));
	
}
