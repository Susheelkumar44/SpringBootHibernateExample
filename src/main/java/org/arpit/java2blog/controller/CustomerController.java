package org.arpit.java2blog.controller;

import java.util.List;

import org.arpit.java2blog.model.Customer;
import org.arpit.java2blog.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(value = "/signUp", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getAllCustomers(Model model) {

		List<Customer> listOfCustomers = customerService.getAllCustomers();
		model.addAttribute("customer", new Customer());
		model.addAttribute("listOfCustomers", listOfCustomers);
		return "signUp";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePage() {
		return "index";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goTologinPage() {
		return "login";
	}
	@RequestMapping(value = "/contact", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToContactPage() {
		return "contact";
	}
	@RequestMapping(value = "/index", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goToHomePageOnClickLogo() {
		return "index";
	}
	@RequestMapping(value = "/hotels", method = RequestMethod.GET, headers = "Accept=application/json")
	public String goTohotelPage() {
		return "hotels";
	}
	@RequestMapping(value = "/getCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getCustomer(id);
	}

	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addCustomer(@ModelAttribute("customer") Customer customer) {	
		if(customer.getId()==0)
		{
			customerService.addCustomer(customer);
		}
		else
		{	
			//customerService.updateCustomer(customer);
		}

		return "redirect:/signUp";
	}

	@RequestMapping(value = "/updateCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updateCustomer(@PathVariable("id") int id,Model model) {
		model.addAttribute("customer", this.customerService.getCustomer(id));
		model.addAttribute("listOfCustomers", this.customerService.getAllCustomers());
		return "customerDetails";
	}

	@RequestMapping(value = "/deleteCustomer/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String deleteCustomer(@PathVariable("id") int id) {
		//customerService.deleteCustomer(id);
		return "redirect:/getAllCustomers";

	}	
}
