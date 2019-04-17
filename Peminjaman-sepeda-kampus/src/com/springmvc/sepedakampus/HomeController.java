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
	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
	@RequestMapping("/display")
	public String display(HttpServletRequest request, Model model) {
		
		String nama = request.getParameter("nama");
		String ttl = request.getParameter("ttl");
		String jenis_kelamin = request.getParameter("jenis_kelamin");
		String alamat = request.getParameter("alamat");
		
		model.addAttribute("nama", nama);
		model.addAttribute("ttl", ttl);
		model.addAttribute("jenis_kelamin", jenis_kelamin);
		model.addAttribute("alamat", alamat);

		
		return "display";
	}
}
