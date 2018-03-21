package com.entity;

public class User {
   private Integer id;
   private String name;
   private String phone;
   private String email;
   public User(){}
   public User(String name,String phone){
	   this.name=name;
	   this.phone=phone;
   };
   
   public User(Integer id,String name,String phone){
	   this.id=id;
	   this.name=name;
	   this.phone=phone;
   };
   
   public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}   
