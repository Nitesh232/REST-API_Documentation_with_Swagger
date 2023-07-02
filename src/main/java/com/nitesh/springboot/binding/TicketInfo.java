package com.nitesh.springboot.binding;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Ticket_Details")
public class TicketInfo {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer passangerId;
	
	private String ticketStatus;
	
	private Double ticketPrice;
	
	private String ticketPNR;
	
	private Date ticketBookingDate;
	
	private String firstName;
	
	private String lastName;
	
	private Integer age;
	
	private Long contactNumber;
	
	private String toStation;
	
	private String fromStation;
	
	private String journeyDate;
	
	private Integer ticketCount;


}
