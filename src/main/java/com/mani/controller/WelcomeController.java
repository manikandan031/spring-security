package com.mani.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcome(){
		System.out.println("Welcome " + SecurityContextHolder.getContext().getAuthentication().getName());
		
		return "welcome";
	}
}
