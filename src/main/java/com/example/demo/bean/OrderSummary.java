package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class OrderSummary {

	@Id
	private Integer orderId;
	
	private String  CustomerName;
	

	
	private Double price;
	
	
}
