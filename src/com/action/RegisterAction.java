package com.action;


import com.entity.User;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class RegisterAction extends ActionSupport{
	private String name;
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
	private String phone;
	private String email;
	
	
	private UserService userService;
      public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String register(){
    	  User user =new User();
    	  user.setName(name);
    	  user.setPhone(phone);
    	  user.setEmail(email);
    	  userService.add(user);
    	  return SUCCESS;
      }
}
