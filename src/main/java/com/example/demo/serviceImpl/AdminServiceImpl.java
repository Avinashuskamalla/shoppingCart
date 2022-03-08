package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.AdminRepo;
import com.example.demo.bean.admin.Admin;
import com.example.demo.service.AdminService;

@Service
public class AdminServiceImpl  implements AdminService {

	@Autowired
	private AdminRepo adminRepo;
	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
		adminRepo.save(admin);
		
	}

}
