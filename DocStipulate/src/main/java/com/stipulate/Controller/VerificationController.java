package com.stipulate.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class VerificationController {
	
	@GetMapping(value="/verifyaccount")
	public ModelAndView verify( ) {
		
		ModelAndView modelAndView=new ModelAndView();		modelAndView.setViewName("user/Verification");
		
		return modelAndView;
	}

	
}
