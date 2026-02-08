package com.example.login.spj._5.sign;

import org.springframework.stereotype.Service;

@Service
public class Authent {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("nagasheshu");
		boolean isValidPassword = password.equalsIgnoreCase("sumanth");
		
		return isValidUserName && isValidPassword;
	}

}
