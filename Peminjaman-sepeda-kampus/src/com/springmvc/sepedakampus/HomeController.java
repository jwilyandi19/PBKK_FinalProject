package com.springmvc.sepedakampus;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showMyPage() {
		return "dashboard";
	}
	
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
	
	@RequestMapping("/formpeminjaman")
	public String formpeminjaman() {
		return "formpeminjaman";
	}
	
	@RequestMapping("/formpengembalian")
	public String formpengembalian() {
		return "formpengembalian";
	}
	
	@RequestMapping("/datapeminjaman")
	public String datapeminjaman() {
		return "data-peminjaman";
	}
	
	@RequestMapping("/notifikasi")
	public String notifikasi() {
		return "notifikasi";
	}
	
	
	@RequestMapping("/managecycle")
	public String managecycle() {
		return "manage-cycle";
	}
	
	@RequestMapping("/manageuser")
	public String manageuser() {
		return "manage-user";
	}
	

}
