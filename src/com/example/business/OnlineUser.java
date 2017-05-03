package com.example.business;

public class OnlineUser extends User{
	public OnlineUser(String fName,String lName,String userId,String password,String birthday)
	{
		this.userId=userId;
		this.fName=fName;
		this.lName=lName;
		this.password=password;
		this.birthday=birthday;	
	}
}
