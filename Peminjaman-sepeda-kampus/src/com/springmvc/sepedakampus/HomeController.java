package com.springmvc.sepedakampus;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showMyPage() {
		return "index";
	}
	
//	@RequestMapping("/login")
//	public String login() {
//		return "login";
//	}
//	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/homepage")
	public String homepage() {
		return "homepage";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
	

}
