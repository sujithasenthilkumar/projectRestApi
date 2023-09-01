package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Toy;

@Repository
public interface ToyRepo extends
JpaRepository<Toy,Integer>{

}