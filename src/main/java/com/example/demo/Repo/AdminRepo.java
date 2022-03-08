package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.admin.Admin;

public interface AdminRepo  extends JpaRepository<Admin,Integer>{

}
