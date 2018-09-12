package org.arpit.java2blog.controller;

import java.util.List;

import org.arpit.java2blog.model.Flights;
import org.arpit.java2blog.service.BookingService;
import org.arpit.java2blog.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class BookingController {
	@Autowired
	BookingService bookingService;
	@RequestMapping(value = "/Book2/{flightid}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getFlight(Model model,@PathVariable int flightid) {
		List<Flights> listFlights = bookingService.getFlight(flightid);
		System.out.println("11");
		model.addAttribute("Flights", new Flights());
		model.addAttribute("listFlights", listFlights);
		return "Book2";
	}
}