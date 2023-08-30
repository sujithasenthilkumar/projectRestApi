package com.example.toystore.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.toystore.model.Customer;

@Repository
public interface CustomerRepo extends
JpaRepository<Customer,Integer>{
	
}