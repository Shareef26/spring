package com.SpringBeginner.DTO;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CustomerDTO {
	private long phonNo;
	private String name;
	private String email;
	private int age;
	private char gender;
	private  FriendFamilyDTO  friendAndFamily;
	private String password;
	private String address;
	private PlanDTO currentplan;
	
	public CustomerDTO() {
		
	}
	
	public CustomerDTO(long phonNo, String name, String email, int age, char gender,
			FriendFamilyDTO friendAndFamily, String password, String address, PlanDTO currentplan) {
		super();
		this.phonNo = phonNo;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.friendAndFamily = friendAndFamily;
		this.password = password;
		this.address = address;
		this.currentplan = currentplan;
	}
	public long getPhonNo() {
		return phonNo;
	}
	public void setPhonNo(long phonNo) {
		this.phonNo = phonNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public  FriendFamilyDTO  getFriendAndFamily() {
		return friendAndFamily;
	}
	public void setFriendAndFamily( FriendFamilyDTO  friendAndFamily) {
		this.friendAndFamily = friendAndFamily;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public PlanDTO getCurrentplan() {
		return currentplan;
	}
	public void setCurrentplan(PlanDTO currentplan) {
		this.currentplan = currentplan;
	}
	
	
	

}
