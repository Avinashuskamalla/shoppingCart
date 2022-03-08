package com.example.demo.controller;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.bean.Cart;
import com.example.demo.hepler.FileUploader;
import com.example.demo.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

  @Autowired	
  private CartService cartService;
  
  @Autowired
  private FileUploader fileUploader;
	
	
	@PostMapping("/addCart")
	public ResponseEntity<?> addToCart(@RequestBody Cart cart) {

		try {
		
			this.cartService.addToCart(cart);
			return new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
		
			System.out.println(e.getMessage());
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST); 
		}		
		
	}
	
	@PostMapping("/upload-file")
	public ResponseEntity<String> UploadFile(@RequestParam("file")   MultipartFile file)
	{
		
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		
		try {
		
			if(file.isEmpty())
			{
				
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("request must contain file");
			}
			
			if (!file.getContentType().equals("image/jpeg")) {
				
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("only jpeg content can pass");
			}
			
		boolean f=fileUploader.uploadFile(file);
		
		if(f)
		{
			
			return ResponseEntity.ok("file successfull");
		}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
			
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("sometime went wrong");
		
	}
	
	

}
