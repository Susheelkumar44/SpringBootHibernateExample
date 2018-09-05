package org.arpit.java2blog.controller;

import java.util.List;

import org.arpit.java2blog.model.Flights;
import org.arpit.java2blog.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FlightController {

	@Autowired
	FlightService flightService;
	@RequestMapping(value = "/flights", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getAllFlights(Model model) {

		List<Flights> listOfFlights = flightService.getAllFlights();
		System.out.println("1");
		model.addAttribute("Flights", new Flights());
		model.addAttribute("listOfFlights", listOfFlights);
		return "flights";
	}
}
