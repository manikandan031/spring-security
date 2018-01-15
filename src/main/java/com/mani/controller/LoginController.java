package com.mani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(){
		System.out.println("Home");
		return "login";
	}
	
	@RequestMapping(value="/postlogin", method=RequestMethod.GET)
	public String home(@RequestParam(value="error", required=false) String error){
		System.out.println("postlgin : isError - " + error);
		return "welcome";
	}
	
	
}
