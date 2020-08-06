package com.SpringBeginner.Repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringBeginner.DTO.CustomerDTO;
import com.SpringBeginner.DTO.FriendFamilyDTO;
import com.SpringBeginner.DTO.PlanDTO;

@Component
public class CustomerRepository {
	
	List<CustomerDTO> customerlist=new ArrayList<CustomerDTO>();
	
	@PostConstruct
	public void initializer() {
		
		
		CustomerDTO customerdto= new CustomerDTO();
		PlanDTO plandto=new PlanDTO();
		FriendFamilyDTO freind=new FriendFamilyDTO();
		
		plandto.setLocalRate(1);
		plandto.setNationalRate(2);
		plandto.setPlanId(1);
		plandto.setPlanName("One Paisa");
		
	freind.setFriendAndFamily(1);
	freind.setPhoneNo(56824655);
	
	
	customerdto.setAddress("Guddadahalli");
	customerdto.setAge(25);
	customerdto.setCurrentplan(plandto);
	customerdto.setEmail("mshareef@gmail.com");
	customerdto.setFriendAndFamily(freind);
	customerdto.setGender('M');
	customerdto.setName("Shareef");
	customerdto.setPassword("123");
	customerdto.setPhonNo(96638295);
	
	
	customerlist.add(customerdto);
	
	}
	
	public String  createCustomer(CustomerDTO customerdto) {
		customerlist.add(customerdto);
		return customerdto.getAddress()+" added";
		
	}
	
	public List<CustomerDTO> fetchCustomer(){
		return customerlist;
	}

	
}
