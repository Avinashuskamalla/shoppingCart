package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.Address;

public interface AddressRepo extends JpaRepository<Address,String> {

}
