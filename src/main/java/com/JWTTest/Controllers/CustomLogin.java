package com.JWTTest.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomLogin {
	
	@GetMapping("/customlogin")
	public String showmeLoginpage() {
		
		return "customlogin.html";
	}
	
	
	@GetMapping("/mytest")
	public String mytest() {
		
		return "customlogin.html";
	}
	
	

}
