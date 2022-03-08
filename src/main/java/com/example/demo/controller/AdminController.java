package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.admin.Admin;
import com.example.demo.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService; 
	
	@PostMapping("/addAdmin")
	public ResponseEntity<String> admin(@RequestBody Admin admin)
	{
	 try {
	
		    adminService.addAdmin(admin);
			
			return ResponseEntity.ok().body("succesfully added");
		 
	} catch (Exception e) {
	
		// TODO: handle exception
		return ResponseEntity.badRequest().body("failed");
	}
	
		
		
	}
	
}
