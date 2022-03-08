package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.CartRepo;
import com.example.demo.bean.Cart;
import com.example.demo.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartRepo cartRepo;
	
	@Override
	public void addToCart(Cart cart) {
		// TODO Auto-generated method stub
	//cartRepo.save(cart);

		cartRepo.insert(cart);
		
	}

}
