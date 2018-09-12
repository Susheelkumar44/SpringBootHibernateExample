package org.arpit.java2blog.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.PageContext;

import org.arpit.java2blog.model.Flights;
import org.arpit.java2blog.service.BookingService;
import org.arpit.java2blog.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConfirmController  {
	@RequestMapping(value = "/confirm", method = RequestMethod.GET, headers = "Accept=application/json")

	public String getAllCustomers(Model model,@RequestParam String pc,@RequestParam String travelClass,@RequestParam double cost){
		
		double price1=0.0;
		double price=cost;
		System.out.println(price);
		if(pc.equals("1"))
		{
			price1=price*1;
		}
		else if(pc.equals("2"))
		{
			price1=price*2.0;
		}
		else if(pc.equals("3"))
		{
			price1=price*3;
		}
		else if(pc.equals("4"))
		{
			price1=price*4;
		}
		else {
			price1=price*5;
		}
		
		if(travelClass.equals("Economy"))
		{
			price1=price1;
		}
		else if(travelClass.equals("Premium Economy"))
		{
			price1=1.5*price1;
		}
		else
		{
			price1=2*price1;
		}
		System.out.println(price1);
		model.addAttribute("msg", price1);
		return "confirm";
	}
}
