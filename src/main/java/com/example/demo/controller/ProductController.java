package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.admin.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/addProduct")
    public ResponseEntity<String> product(@RequestBody Product product)
	{
		try {
	
			productService.addProduct(product);
			
			return ResponseEntity.ok().body("succesfully added");
			
		} catch (Exception e) {
			// TODO: handle exception
	
			e.printStackTrace();
			
			return ResponseEntity.badRequest().body("failed");
		}
		
	 
		
	}

}
