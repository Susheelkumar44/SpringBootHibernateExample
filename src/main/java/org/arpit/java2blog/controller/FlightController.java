package org.arpit.java2blog.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.arpit.java2blog.dao.FlightDao;
import org.arpit.java2blog.dao.FlightDaoImpl;
import org.arpit.java2blog.model.Flights;
import org.arpit.java2blog.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FlightController {
	
	@Autowired
    FlightService flightService;
	
    /*@RequestMapping(value = "/flights", method = RequestMethod.GET, headers = "Accept=application/json")
    public String getAllCustomers(Model model) {

           List<Flights> listOfFlights = flightService.getAllFlights();
           System.out.println("1");
           model.addAttribute("Flights", new Flights());
           model.addAttribute("listOfFlights", listOfFlights);
           return "flights";
    }*/
    
    @RequestMapping(value = "/flights", method = RequestMethod.GET)
    public ModelAndView show() {
    	return new ModelAndView("flights");
    }
    
    @RequestMapping(value = "/flightsearch", method = RequestMethod.GET)
    public ModelAndView valid(Model model, @ModelAttribute("source")String source,
    @ModelAttribute("destination")String destination,@ModelAttribute("departdate")String departDate,
    /*@ModelAttribute("passengerNo")int passengerNo,*/
    Flights flight,BindingResult result,Map<String,Object> model1)
    {
        FlightDaoImpl ob=new FlightDaoImpl();
        if (!result.hasErrors())
        {
        ModelAndView mav= new ModelAndView ("flights");
        //System.out.println(passengerNo);
        //System.out.println("Class:"+fclass);
        System.out.println("Date:"+departDate);
        System.out.println(source+destination);
        List<Flights> flist=new ArrayList<Flights>();
                 flist=ob.availableFlights(source,destination,departDate);
                 for(int i=0;i<flist.size();i++)
                 System.out.println(flist.get(i));
                 model.addAttribute("msg",flist);
                 
       /* return mav;*/
        
        }
        /*if(returnDate!=null)
        {
        	ModelAndView mav= new ModelAndView ("Flight");
            System.out.println(passengerNo);
            System.out.println("Class:"+fclass);
            System.out.println("Date:"+departDate+returnDate);
            System.out.println(source+destination);
            List<FlightPojo> flist=new ArrayList<FlightPojo>();
                     flist=ob.availableFlights(source,destination,departDate,fclass,passengerNo);
                     System.out.println(flist.toString());
                     model.addAttribute("msg",flist);
            return mav;
        	
        }*/
       return new ModelAndView("FlightSearch");
           
        
       }


}
