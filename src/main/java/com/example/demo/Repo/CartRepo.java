package com.example.demo.Repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {
	
    @Transactional
	@Modifying
	@Query(value = "insert into cart (item_id,item,item_Name,price,seller,size)"+ "values(:#{#cart.itemId},:#{#cart.item},:#{#cart.itemName},:#{#cart.price},:#{#cart.seller},:#{#cart.size})",nativeQuery = true)
	public void insert(@Param("cart") Cart cart);

    
}
