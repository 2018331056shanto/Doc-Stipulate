package com.stipulate.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.stipulate.Entity.Verification;
import com.stipulate.Service.VerificationService;

@RestController
public class VerificationController {
	@Autowired
	private VerificationService verificationService;
	
	@GetMapping(value="/verifyaccount")
	public ModelAndView verify(@Validated @ModelAttribute("verification") Verification verification, BindingResult bindingResult,ModelMap modelMap ) {
		System.out.println(verification.getEmail());
		System.out.println(verification.getToken());
		
		System.out.println("hello hi");
		verificationService.save(verification);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("email",verification.getEmail());
		modelAndView.setViewName("user/Verification");
		
		return modelAndView;
	}

	
}
