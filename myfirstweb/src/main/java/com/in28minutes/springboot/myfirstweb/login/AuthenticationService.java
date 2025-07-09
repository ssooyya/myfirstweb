package com.in28minutes.springboot.myfirstweb.login;

import org.springframework.stereotype.Service;

//유효성 검증

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("hskwoon");
		boolean isValidPassword = password.equalsIgnoreCase("1234");
		
		return isValidUserName && isValidPassword; 
	}

}
