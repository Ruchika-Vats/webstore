package dev.sunny.webstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping({"", "/", "/welcome"})
	public String welcome(Model model) {
		model.addAttribute("greeting", "Welcome to Web Portal!");
		model.addAttribute("tagline", "Created without Spring Boot.");
		
		return "welcome";
	}
}
