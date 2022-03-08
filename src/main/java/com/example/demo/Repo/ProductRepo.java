package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.admin.Product;

public interface ProductRepo  extends JpaRepository<Product, Integer> {

}
