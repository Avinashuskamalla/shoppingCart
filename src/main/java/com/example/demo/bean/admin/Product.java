package com.example.demo.bean.admin;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	
@Id	
private Integer productId;
	
private  String productName;

private Double price;

private Integer quantity;

private LocalDateTime dateTime;
	
	
}
