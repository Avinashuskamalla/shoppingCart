package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.Repo;
import com.example.demo.bean.User;
import com.example.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private Repo repo;
	
	@Override
	public void addDetails(User user) {
		// TODO Auto-generated method stub
		
		repo.save(user);


	}

}
