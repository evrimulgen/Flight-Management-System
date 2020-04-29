package com.org.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.model.Airport;
import com.org.model.Flight;
import com.org.service.FlightService;

@RestController
@RequestMapping("/flight")
public class FlightController
{
	@Autowired(required=true)
FlightService flightService;
	@PostMapping("/addFlight")
	public void addFlight(Flight flight)
	{
		flightService.addFlight(flight);
	}
	@RequestMapping("/allFlight")
	public Iterable<Flight> viewAllFlight()
	{
		return flightService.viewAllFlight();
	}
	@RequestMapping("/viewFlight/{id}")
	public Flight viewAirport(@PathVariable("id") BigInteger flightNo)
	{
	    return flightService.viewFlight(flightNo);	
	}
	@PutMapping("/updateFlight/")
	public void modifyFlight(Flight flight)
	{
		flightService.modifyFlight(flight);
	}
	@DeleteMapping("/deleteFlight/{id}")
	public void removeFlight(@PathVariable("id") BigInteger flightNo)
	{
		flightService.removeFlight(flightNo);
	}
}