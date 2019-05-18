package com.springmvc.sepedakampus.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

import com.springmvc.sepedakampus.dao.PosDAO;
import com.springmvc.sepedakampus.entity.Pos;

@Controller
public class HomeController {
	
	@Autowired
	private PosDAO posDAO;
	
	
	
	@RequestMapping("/")
	public String showMyPage() {
		return "index";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/homepage")
	public String homepage(Model myModel) {
		List <Pos> thePoss = posDAO.getPoss();
		myModel.addAttribute("poss", thePoss);
		
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
