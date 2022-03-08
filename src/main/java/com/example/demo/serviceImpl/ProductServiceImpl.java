package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.ProductRepo;
import com.example.demo.bean.admin.Product;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl  implements ProductService{

	@Autowired
	private ProductRepo productRepo;
	
	
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
	
		productRepo.save(product);
		
	}

}
