package com.fkfolder10.secureapp;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/logout")
	public String logoutPage()
	{
		return "logout.jsp";
	}
	
	@RequestMapping("/user")
	@ResponseBody
	public Principal user(Principal principal)      //principal is a class,object from java security
	{
		return principal;
	}
}
