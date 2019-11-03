package com.newworld.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validate(String id, String pwd) {
		if (id.equals("test") && pwd.equals("test")) {
			return true;
		} else {
			return false;
		}
	}
}
