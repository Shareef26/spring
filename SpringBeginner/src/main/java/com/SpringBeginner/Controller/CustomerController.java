package com.SpringBeginner.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBeginner.DTO.CustomerDTO;
import com.SpringBeginner.Service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	
	@Autowired
	private CustomerService customerservice;
	
	
@GetMapping(produces = "application/json")
public List<CustomerDTO> fetchCustomer(){
	return customerservice.fetchCustomer();
}

@PostMapping(consumes = "application/json")
public ResponseEntity<String> createCustomer(@RequestBody CustomerDTO customerdto) {
	String response=customerservice.createCustomer(customerdto);
	
	return ResponseEntity.ok(response);
}
	
}
