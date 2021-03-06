package com.springmvc.sepedakampus;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springmvc.sepedakampus.model.User;
import com.springmvc.sepedakampus.service.IUserService;

@Controller
public class HomeController {

	
	@Autowired
	private IUserService userService;
	
	/*
	 * @GetMapping("/") public String showHomePage(HttpSession httpSession) { User
	 * user = (User) httpSession.getAttribute("user"); if(user!=null) { return
	 * "redirect:/user-home"; }
	 * 
	 * return "index"; }
	 */

	@GetMapping("/")
	public String loginPage(Model model, HttpSession httpSession) {
		User user = (User) httpSession.getAttribute("user");
		//jika ada session user, maka redirect ke dashboard user
		if(user!=null) {
			return "redirect:/user-home";
		}
		model.addAttribute("user", new User());
		
		return "index";
	}
	
	@GetMapping("/admin")
	public String loginPageAdmin(Model model, HttpSession httpSession) {
		User user = (User) httpSession.getAttribute("user");
		//jika ada session user, maka redirect ke dashboard user
		if(user!=null) {
			return "redirect:/user-home";
		}
		model.addAttribute("user", new User());
		
		return "index";
	}
	
	@PostMapping("/form-peminjaman")
	public String formpeminjaman(User user, HttpSession httpSession, Model model) {
	
		
		return "formpeminjaman";
	}
	
	
	/*
	 * @GetMapping("/register") public String showRegistrationPage(Model model,
	 * HttpSession httpSession) { model.addAttribute("user", new User());
	 * 
	 * return "register"; }
	 */
	  
	 @PostMapping("/addUser") public String addUser(@ModelAttribute("user") User
	 user) { userService.addUser(user); return "redirect:/manageuser"; }
	 
}
