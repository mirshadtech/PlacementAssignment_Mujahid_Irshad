package in.ineuron.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ineuron.model.Admin;
import in.ineuron.service.IAdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private IAdminService service;

	@GetMapping("/")
	public String showHomePage() {
		return "index";
	}

	@GetMapping("/registerPage")
	public String showRegisterPage(Model model) {
		Admin admin = new Admin();
		model.addAttribute("admin", admin);
		return "register";
	}

	@PostMapping("/save")
	public String registerAdmin(@ModelAttribute("admin") Admin admin, Model model) {
		String status = service.saveAdminData(admin);
		model.addAttribute("status", status);
		return "index";
	}

	@PostMapping("/login")
	public String adminLogin(HttpServletRequest request, Model model) {
		String mail = request.getParameter("adminMail");
		String password = request.getParameter("adminPassword");
		Admin admin = service.fetchAdminByMail(mail);
		String logicalViewName = null;

		if (admin == null) {
			model.addAttribute("message", "Enter vaild Email");
			logicalViewName = "index";
		}
		else if (admin.getPassword().equals(password)) {

			model.addAttribute("adminData", admin);
			logicalViewName = "homePage";

		}else {
			model.addAttribute("message", "Enter vaild Details");
			logicalViewName = "index";
		}
		return logicalViewName;
	}

}
