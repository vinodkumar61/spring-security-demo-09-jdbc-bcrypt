package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    
	@RequestMapping("/")
	public String showHome() {
		
		return "home";
	}
	
	// add request mapping for /leaders
	
	@RequestMapping("/leaders")
	public String showLeaders() {
		
		return "leaders";
	}
	
	// add request mapping for /systems
	
		@RequestMapping("/systems")
		public String showSystems() {
			
			return "systems";
		}
	
}
