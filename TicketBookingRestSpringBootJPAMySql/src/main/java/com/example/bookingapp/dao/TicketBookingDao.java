package com.example.bookingapp.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.bookingapp.entities.Ticket;
import java.lang.String;
import java.util.List;

public interface TicketBookingDao  extends CrudRepository<Ticket, Integer>{
	
	List<Ticket> findByEmail(String email);
	List<Ticket> finaBySourceStation(String sourceStation);
	List<Ticket> finaByDestStation(String destStation);
	@Query(value="select t from Ticket t where t.passengerName =?1",nativeQuery=false)
	List<Ticket> finaByPassengername(String passengerName);

}
