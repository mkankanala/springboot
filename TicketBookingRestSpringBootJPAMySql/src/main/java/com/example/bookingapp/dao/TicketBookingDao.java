package com.example.bookingapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.bookingapp.entities.Ticket;

public interface TicketBookingDao  extends CrudRepository<Ticket, Integer>{
	
	

}
