package com.example.bookingapp;

import java.util.Date;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.bookingapp.controller.TicketBookingController;
import com.example.bookingapp.entities.Ticket;
import com.example.bookingapp.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingAppManagementApplication {
	
		public static void main(String[] args) {
	SpringApplication.run(TicketBookingAppManagementApplication.class, args);
	
	}


}
