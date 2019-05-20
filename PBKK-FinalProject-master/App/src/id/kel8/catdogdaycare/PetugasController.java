package id.kel8.catdogdaycare;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
			
			return "redirect:/petugas";
		}
		return "redirect:/loginPetugas";
		
		
	}
	
	@GetMapping("/petugas")
	public String dashboard()
	{
		return "dashboard";
		
	}
	
}
