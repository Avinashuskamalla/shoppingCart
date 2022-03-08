package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Address {

	
	@Id
	private String customerId;
	
	private String address1;
	
	private String address2;
	
	@Size(min = 1 , max=6)
	private Integer pincode;
	
	
	
	
}
