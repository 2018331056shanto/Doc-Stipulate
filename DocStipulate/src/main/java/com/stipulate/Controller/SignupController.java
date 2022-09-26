package com.stipulate.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SignupController {
	
	@GetMapping(value="/signin")
	public ModelAndView signin() {
		System.out.println("hello how are you");
		return new ModelAndView("user/Login");
		
	}
	

}
