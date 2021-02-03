package com.crud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	public WelcomeController(){
		System.out.println("\n\n===Welcome Contoller Initialized===\n\n");
	}
	
	
	@RequestMapping("/welcome")
	public String welcomePage(){ //Return type is string as we are returning view name
		return "index.jsp";
	}

}
