package com.SpringBeginner.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringBeginner.DTO.CustomerDTO;
import com.SpringBeginner.Repository.CustomerRepository;

@Component
public class CustomerService {

	@Autowired
	private CustomerRepository customerrepo;
	
	public String createCustomer(CustomerDTO customerdto) {
		return customerrepo.createCustomer(customerdto);}
	
	public List<CustomerDTO> fetchCustomer(){
		return customerrepo.fetchCustomer();
	}
	
}
