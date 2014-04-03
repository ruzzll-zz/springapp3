package com.helloworld.controller.admin;

import java.util.Locale;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class DashboardController {
	
	@RequestMapping(value = {"/dashboard", "/"}, method = RequestMethod.GET)
	public String index(Locale locale, Model model){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		model.addAttribute("username", auth.getName());
		model.addAttribute("password", "");
		
		return "admin/dashboard";
	}

}