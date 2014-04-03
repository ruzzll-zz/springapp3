package com.helloworld.controller.admin;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class DashboardController {
	
	@RequestMapping(value = {"/dashboard", "/"}, method = RequestMethod.GET)
	public String index(Locale locale, Model model){
		return "admin/dashboard";
	}

}