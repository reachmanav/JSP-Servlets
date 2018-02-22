package org.manav.javabrains.service;

import java.util.HashMap;

import org.manav.javabrains.model.User;

public class LoginAuthService {
	
	private HashMap<String, String> userList = new HashMap<String,String>();
	
	public LoginAuthService()  {
		
		userList.put("manav", "Manav Shah");
		userList.put("dhaval", "Dhaval Shah");
		userList.put("puja", "Puja Shah");
		
	}

	public boolean authenticate(String user, String password)  {
		
		
		System.out.println("Inside authenticate. Value of Password is: "+password);
		if ((password == null) || (password.trim() == "")) {
			return false;
		}
		
		return true;
	}
	
	public User getUserDetails (String userId)  {
		
		User user = new User();
		user.setUserId(userId);
		
		if (userList.get(userId) != null)  {
			user.setUserId(userId);
			user.setUserName(userList.get(userId));
		}
	
		return user;
	}
}
