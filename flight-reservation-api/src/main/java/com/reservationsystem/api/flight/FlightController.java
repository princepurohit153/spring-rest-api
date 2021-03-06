package com.reservationsystem.api.flight;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {
	
	@Autowired
	private FlightService flightService;
	
	@RequestMapping("/flights")
	public List<Flight> getFlights(){
		return flightService.getAllFlights();
	}
	
	@RequestMapping("flights/{number}")
	public Flight getFlight(@PathVariable("number") String flightNo){
		return flightService.getFlight(flightNo);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/flights")
	public void addFlight(@RequestBody Flight flight){
		flightService.addFlight(flight);		
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/flights/{id}")
	public void updateFlight(@RequestBody Flight flight, @PathVariable("id") String id){
		flightService.updateFlight(id, flight);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/flights/{id}")
	public void deleteFlight(@PathVariable("id") String id){
		flightService.deleteFlight(id);		
	}
}
