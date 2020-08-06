package com.SpringBeginner.DTO;

public class FriendFamilyDTO {

	private long phoneNo;;
	private long friendAndFamily;
	
	public FriendFamilyDTO() {
		
	}
	
	public FriendFamilyDTO(long phoneNo, long friendAndFamily) {
		super();
		this.phoneNo = phoneNo;
		this.friendAndFamily = friendAndFamily;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public long getFriendAndFamily() {
		return friendAndFamily;
	}
	public void setFriendAndFamily(long friendAndFamily) {
		this.friendAndFamily = friendAndFamily;
	};
	
	
	
}
