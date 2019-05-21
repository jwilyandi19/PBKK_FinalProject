package com.springmvc.sepedakampus;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.sepedakampus.model.User;
import com.springmvc.sepedakampus.service.IUserService;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PetugasController {
	
	
	
	@GetMapping("/loginPetugas")
	public String loginPetugas()
	{
		return "login";
		
	}
	@PostMapping("/petugas-check")
	public String petugasCheck(@RequestParam(name = "password") String password,@RequestParam(name = "username") String username,   HttpSession httpSession) {

		if(password.equals("pass") && username.equals("admin") ) {
			httpSession.setAttribute("admin", username);
			
			return "redirect:/dashboard";
		}
		return "redirect:/loginPetugas";
		
		
	}
	
	@GetMapping("/dashboard")
	public String dashboard()
	{
		return "dashboard";
	}
	
	@GetMapping("/manageuser")
	public String manageuser()
	{
		return "manage-user";
	}
	
	@GetMapping("/register")
	public String showRegistrationPage(Model model, HttpSession httpSession) { 
		model.addAttribute("user", new User());
		return "newreg";
	}
	
	@GetMapping("/datapeminjaman")
	public String datapeminjaman()
	{
		return "data-peminjaman";
	}
	
	@GetMapping("/managecycle")
	public String managecycle()
	{
		return "manage-cycle";
	}
	
}
