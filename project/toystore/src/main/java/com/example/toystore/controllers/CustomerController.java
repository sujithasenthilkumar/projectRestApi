package com.example.toystore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.toystore.model.Customer;
import com.example.toystore.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@PostMapping("/add1")
	public Customer add(@RequestBody Customer customer) {
		return customerService.add(customer);
	}
	
	@PostMapping("/addlist1")
	public List<Customer> addCustomers(@RequestBody List<Customer> customer){
		 return customerService.addCustomers(customer);
	}
	
	@GetMapping("/show1")
	public List<Customer> showCustomers() {
		return customerService.showCustomers();
	}
	
	@GetMapping("/pagination1/{pageNo}/{pageSize}")
    public List<Customer> pagination(@PathVariable int pageNo,@PathVariable int pageSize){
		return customerService.pagination(pageNo, pageSize);
    }
	
    @GetMapping("sorting1/{pageNo}/{pageSize}/{field}")
    public List<Customer> sorting(@PathVariable int pageNo,@PathVariable int pageSize,@PathVariable String field){
    	return customerService.sorting(pageNo, pageSize, field);
    }
	
	@PutMapping("/update1")
	public Customer updateCustomer(@RequestBody Customer customer){
		return customerService.updateCustomer(customer);
	}
		
	@DeleteMapping("/delete1")
	public String deleteCustomer(@RequestBody Customer customer){
		customerService.deleteCustomer(customer);
		return "customer deleted successfully";
	}
	
	 @DeleteMapping("/deletebyid1/{id}")
	 public String deleteById(@PathVariable int id){
		 customerService.deleteById(id);
		 return "customer deleted successfully";
	 }
}