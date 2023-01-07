package com.app.dto;

import com.app.pojos.Customer;
import com.app.pojos.Employee;

import lombok.Data;

@Data
public class CustomerAndJWT {
	
	private Employee employee;
	private Customer customer;
	private String jwt;
	private String userRole;
}
