package com.example.bookingapp;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.bookingapp.controller.TicketBookingController;
import com.example.bookingapp.entities.Ticket;
import com.example.bookingapp.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingAppManagementApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(TicketBookingAppManagementApplication.class, args);
		
		
		ConfigurableApplicationContext config =SpringApplication.run(TicketBookingAppManagementApplication.class, args);
		
		Ticket t= new Ticket();
		
		t.setBookingDate(new Date());
		t.setEmail("sas@gmail.com");
		t.setDestStation("Guntur");
		t.setSourceStation("Hyderabad");
		t.setTicketId(1);
		t.setPassengerName("Madhavi");
		
		TicketBookingService tbs = config.getBean("ticketBookingService",TicketBookingService.class);
		
		tbs.createTicket(t);
		
	}
}
