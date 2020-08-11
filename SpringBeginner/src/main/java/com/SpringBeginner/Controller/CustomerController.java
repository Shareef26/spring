package com.SpringBeginner.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBeginner.DTO.CustomerDTO;
import com.SpringBeginner.Exception.NosuchCustomerException;
import com.SpringBeginner.Service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	
	@Autowired
	private CustomerService customerservice;
	
	
@GetMapping(produces = "application/json")
public List<CustomerDTO> fetchCustomers(){
	return customerservice.fetchCustomer();
}

@RequestMapping("/names")
@GetMapping(produces= "application/json")
public CustomerDTO fetchCustomerss(@RequestParam("name") String name ) throws NosuchCustomerException {
	CustomerDTO cust=null;
	
	System.out.println("Hi I am in names");
	System.out.println(name);
	
	 
	List<CustomerDTO> custlist=new ArrayList<CustomerDTO>();
	custlist=customerservice.fetchCustomer();
	System.out.println("list fetched");
	
	for(CustomerDTO c:custlist) {
		System.out.println("passed name  " +name);
		System.out.println("list name  "+ c.getName());
		System.out.println("Comparing");
		 if(name.equals(c.getName())) {
			 System.out.println("Hi I am in for");
			 cust=c;
		}
	}
	
	if (cust==null) {
		 throw new NosuchCustomerException("No such CUtsomer");
	}
	
	 
	return cust;
}


// Request Parameter example. cant have 2 GET methods with same req mappings
/*@RequestMapping("/names")
@GetMapping(produces= "application/json")
public CustomerDTO fetchCustomer(@RequestParam("name") String name ) {
	CustomerDTO custnull=null;
	
	System.out.println("Hi I am in names");
	System.out.println(name);
	
	List<CustomerDTO> custlist=new ArrayList<CustomerDTO>();
	custlist=customerservice.fetchCustomer();
	System.out.println("list fetched");
	
	for(CustomerDTO c:custlist) {
		System.out.println("passed name  " +name);
		System.out.println("list name  "+ c.getName());
		System.out.println("Comparing");
		 if(name.equals(c.getName())) {
			 System.out.println("Hi I am in for");
			return c;
		}
	}
	System.out.println("returning null");
	return custnull;
}


/*@RequestMapping("/phone")
@GetMapping(value="{/phone}", produces = "application/json")
public CustomerDTO fetchCustomer1(@PathVariable long phone) {
CustomerDTO custnull=null;
	
	System.out.println("Hi I am in names");
	System.out.println(phone);
	
	List<CustomerDTO> custlist=new ArrayList<CustomerDTO>();
	custlist=customerservice.fetchCustomer();
	System.out.println("list fetched");
	
	for(CustomerDTO c:custlist) {
		System.out.println("passed name  " +phone);
		System.out.println("list name  "+ c.getName());
		System.out.println("Comparing");
		 if(phone==c.getPhonNo()) {
			 System.out.println("Hi I am in for");
			return c;
		}
	}
	System.out.println("returning null");
	return custnull;	
}

*/

@PostMapping(consumes = "application/json")
public ResponseEntity<String> createCustomer(@RequestBody CustomerDTO customerdto) {
	String response=customerservice.createCustomer(customerdto);
	
	return ResponseEntity.ok(response);
}
	
}
