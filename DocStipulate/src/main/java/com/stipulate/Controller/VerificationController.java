package com.stipulate.Controller;


import com.stipulate.Service.UserService;
import com.stipulate.Service.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class VerificationController {

	private  String Email;
	@Autowired
	private VerificationService verificationService;
	@Autowired
	private UserService userService;
	@GetMapping(value="/verifyaccount")
	public ModelAndView verify(@RequestParam String email ) {
		System.out.println(email);
		Email=email;
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("user/Verification");
		
		return modelAndView;
	}
	@PostMapping(value = "/verify")
	public ModelAndView verifyAccount(@ModelAttribute("verification")@RequestParam String code){

//		System.out.println(Email);
		Boolean valid=verificationService.verifyCode(Email,code);
		System.out.println("Am I valid :"+valid);
		if(valid)
		{
			userService.updateStatus(Email);
			return new ModelAndView("redirect:/signin");
		}
		else {
			ModelAndView modelAndView=new ModelAndView();
			modelAndView.addObject("error","Wrong Verification Code");
			modelAndView.setViewName("user/Verification");
			return modelAndView;
		}
	}
	
}
