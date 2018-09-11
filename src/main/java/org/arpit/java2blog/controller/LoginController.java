package org.arpit.java2blog.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.arpit.java2blog.model.Customer;
import org.arpit.java2blog.model.Login;
import org.arpit.java2blog.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login", new Login());
		return mav;
	}
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("login") Login login) {
		ModelAndView mav = null;
		
		Customer customer = customerService.validateCustomer(login);
		
		if(null != customer) {
			mav = new ModelAndView("indexPostLogin");
			mav.addObject("name", customer.getCustomerName());
			
		}
		else {
			mav = new ModelAndView("login");
			mav.addObject("message", "Email or Password is wrong!");
		}
		return mav;
	}

}
