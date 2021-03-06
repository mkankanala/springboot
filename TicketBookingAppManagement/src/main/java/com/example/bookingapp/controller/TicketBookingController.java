package com.example.bookingapp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookingapp.entities.Ticket;
import com.example.bookingapp.service.TicketBookingService;

@RestController
@RequestMapping(value="/api/tickets")
public class TicketBookingController {
	
	@Autowired
	private TicketBookingService ticketBookingService;
	
	@PostMapping(value="/create")
	public Ticket  createTicket(@RequestBody Ticket ticket) {
		
		return ticketBookingService.createTicket(ticket);
	}
	
	@GetMapping(value="/ticket/{ticketid}")
	public Optional<Ticket>  getTicketbyId(@PathVariable("ticketid") Integer  ticketid) {
		
		return ticketBookingService.getTicketbyId(ticketid);
		
		
	}
	
	@GetMapping(value="/getalltickets")
	public Iterable<Ticket> getAllTickets() {
		
		return  ticketBookingService.getAllTickets();
	}
	
	@DeleteMapping(value="/ticket/{ticketid}")
	public void deleteTicket(@PathVariable("ticketid") Integer ticketid) {
		
		 ticketBookingService.deleteTicket(ticketid);
	}
	
	//@PutMapping(value="/ticket/{ticketid}/{email}")
	@RequestMapping(value="/ticket/{ticketid}/{email:.*}", method =RequestMethod.PUT)
	public Ticket updateTicketEamil(@PathVariable("ticketid") Integer ticketid,@PathVariable("email") String email) {
		
		return ticketBookingService.updateTicketEamil(ticketid,email);
	}
	

}
