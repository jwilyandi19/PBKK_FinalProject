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

import java.util.List;

import com.springmvc.sepedakampus.dao.PosDAO;
import com.springmvc.sepedakampus.model.Pos;

@Controller
public class UserController {
	@Autowired
	private PosDAO posDAO;
	@Autowired
	private IUserService userService;
	
	@GetMapping("/user-list")
	public String userListPage(Model model) {
		model.addAttribute("users", userService.getUsers());
		return "user-list";
	}
	
	@PostMapping("/user-check")
	public String userCheck(User user, HttpSession httpSession, Model model) {
		
		User hasil = userService.getUser(user);
		if(hasil==null) {
			return "redirect:/";
		}
		
		httpSession.setAttribute("user", hasil);
		
		return "redirect:/user-home";
	}
	
	
	
	@GetMapping("/user-home")
	public String userHome(Model model, HttpSession httpSession) {
		User user = (User) httpSession.getAttribute("user");
		//jika http session tidak tersimpan, maka redirect ke home atau login
		if(user==null) {
			
			return "redirect:/";
		}
		List <Pos> thePoss = posDAO.getPoss();
		model.addAttribute("poss", thePoss);
		model.addAttribute("user", user);
		return "homepage";
	}
	
	@GetMapping("/user-logout")
	public String userLogout(HttpSession httpSession) {
		httpSession.setAttribute("user", null);
		return "redirect:/";
	}
	
	@GetMapping("/user-profil")
	public String userProfil(@RequestParam("id") int theId, Model model, HttpSession httpSession) {
		User user = (User) httpSession.getAttribute("user");
		//jika http session tidak tersimpan, maka redirect ke home atau login
		if(user==null || user.getUserId()!=theId) {
			
			return "redirect:/login";
		}
		
		User user2 = userService.getUserById(theId);
		model.addAttribute("user", user2);
		return "user-profil";
	}
	
	@GetMapping("/user-edit") 
	public String userEdit(@RequestParam("id") int theId, Model model, HttpSession httpSession) {
		User user = (User) httpSession.getAttribute("user");
		if(user==null || user.getUserId()!=theId) {
			
			return "redirect:/login";
		}
		User user2 = userService.getUserById(theId);
		model.addAttribute("user", user);
		model.addAttribute("modelUser", user2);
		httpSession.setAttribute("user", user2);
		return "user-edit";
	}
	
	@PostMapping("/updateUser")
	public String updateUser(@ModelAttribute("user") User user, HttpSession httpSession) {
		userService.updateUser(user);
		httpSession.setAttribute("user", user);
		return "redirect:/user-profil?id="+user.getUserId();
	}
}
