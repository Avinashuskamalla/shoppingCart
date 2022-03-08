package com.example.demo.controller;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.User;
import com.example.demo.service.LoginService;

@RestController
@RequestMapping("/login")
public class FrontController {

	@Autowired
	private LoginService loginService;
	
	
	@PostMapping("/addDetails")
	public ResponseEntity<?> addDetails(@RequestBody User user) {
		
		try {
		
			LocalDateTime date=LocalDateTime.now();
			System.out.println(date);
			user.setRegDate(date);


			loginService.addDetails(user);
			
			return  new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
			// TODO: handle exception
		
		return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		
		}
		
		
	}
	
}
