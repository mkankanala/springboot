package com.example.bookingapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookingapp.dao.TicketBookingDao;
import com.example.bookingapp.entities.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	
	public Ticket createTicket(Ticket ticket) {
		
		
		return ticketBookingDao.save(ticket);
	
	}


	public Optional<Ticket> getTicketbyId(Integer ticketid) {
		// TODO Auto-generated method stub
		return ticketBookingDao.findById(ticketid);
		
	}


	public Iterable<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return ticketBookingDao.findAll();
	}


	public void deleteTicket(Integer ticketid) {
		// TODO Auto-generated method stub
			ticketBookingDao.deleteById(ticketid);
	}


	public Ticket updateTicketEamil(Integer ticketid, String email) {
		// TODO Auto-generated method stub
		Ticket t = ticketBookingDao.findById(ticketid).get();
		
		 t.setEmail(email);
		
		Ticket savedt =ticketBookingDao.save(t);
		
		return savedt;
		
		
	}


	public List<Ticket> getTicketbyEmail(String email) {
		return ticketBookingDao.findByEmail(email);
	}
	
	
	public List<Ticket> getTicketbySiourceStation(String sourceStation) {
		return ticketBookingDao.finaBySourceStation(sourceStation);
	}


	public List<Ticket> getTicketbyDestStation(String deststation) {
		// TODO Auto-generated method stub
		return ticketBookingDao.finaByDestStation(deststation);
	}


	public List<Ticket> getTicketbyPassengername(String passengername) {
		return ticketBookingDao.finaByPassengername(passengername);
	}

}
