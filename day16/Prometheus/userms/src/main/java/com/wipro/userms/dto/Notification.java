package com.wipro.userms.dto;

import com.wipro.userms.entity.User;

public class Notification {
	
	User user;
    String action;
    
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
    
    

}
