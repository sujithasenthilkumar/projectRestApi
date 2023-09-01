package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Toy;
import com.example.demo.repository.ToyRepo;


@Service
public class ToyService {
	@Autowired
	ToyRepo toyRepository;
public Toy add(Toy toy) {
		
		return toyRepository.save(toy);
	}

	public List<Toy> addToys(List<Toy> toy) {
		
		return toyRepository.saveAll(toy);
	}

	public List<Toy> showToys() {
		
		return toyRepository.findAll();
	}
	
	public List<Toy> pagination(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		Page<Toy> page=toyRepository.findAll(PageRequest.of(pageNo, pageSize));
		return page.getContent();
	}

	public List<Toy> sorting(int pageNo, int pageSize, String field) {
		Page<Toy> page=toyRepository.findAll(PageRequest.of(pageNo, pageSize,Sort.by(field)));
		return page.getContent();
	}


	public Toy updateToy(Toy toy) {
		
		return toyRepository.saveAndFlush(toy);
	}

	public String deleteToy(Toy toy) {
		
		toyRepository.delete(toy);
		return "Deleted successfully";		
	}

	public void deleteById(int id) {
		
		toyRepository.deleteById(id);
	}
}