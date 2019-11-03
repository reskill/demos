package com.newworld.springmvc.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newworld.springmvc.service.LoginService;

@Controller
public class LoginController {
	
	Logger LOGGER = Logger.getLogger(LoginController.class);
	
	@Autowired
	LoginService loginService;
	
	
	@RequestMapping(value="/login")
	public String showLoginPage()
	{
		LOGGER.info("Redirecting to login.jsp");
		return "login";
	}
	
	
	@RequestMapping(value="/checklogin")
	public String login(@RequestParam String loginId, @RequestParam String password, ModelMap model)
	{
		LOGGER.info("In Controller login  " + loginId);
		model.put("name", loginId);
		
		if (!loginService.validate(loginId, password)) {
			model.put("error", "Invalid Login Id and Password");
			return "login";
		} 
		//If Login success then return "home" else return "login" to redirect
		return "home";
	}

}
