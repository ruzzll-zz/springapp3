package com.helloworld.controller.ajax;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.ResponseBody;

import com.helloworld.model.User;

/**
 * Handles requests for the application home page.
 */

@Controller
@RequestMapping("/ajax/user")
public class UserController {
	@RequestMapping(value = "/login", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody User login(Locale locale, Model model){
		User user = new User();
		
		user.setUsername("Ruzzll");
		user.setPassword("5454531");
		
		return user;		
	}
}