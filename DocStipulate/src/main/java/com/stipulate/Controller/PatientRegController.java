package com.stipulate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.stipulate.AOP.Annotation.Hash;
import com.stipulate.Entity.Patient;
import com.stipulate.Entity.User;
import com.stipulate.Service.BoundResultService;
import com.stipulate.Service.PatientRegService;
import com.stipulate.Service.UserService;
import com.stipulate.Service.VerificationService;
import com.stipulate.Service.VerifyMultpleAttributeService;


@RestController
public  class PatientRegController {
	
	@Autowired
	private VerifyMultpleAttributeService attributeService;
	@Autowired
	private BoundResultService boundResultService;
	
	@Autowired
	private PatientRegService patientRegService;
	@Autowired
	private UserService userService;
	@Autowired
	private VerificationService verificationService;
	@GetMapping(value="/register")
	public ModelAndView patientReg() {
		
		
		return new ModelAndView("user/Register");
	}
	
	@PostMapping(value="/register")
	@Hash
	public ModelAndView postPatientReg(@Validated @ModelAttribute("register") User user, BindingResult bindingResult1,@Validated Patient patient,BindingResult bindingResult2, ModelMap modelMap,RedirectAttributes redirectAttributes ) {
		
		
		ModelAndView modelAndView=new ModelAndView();
		try {
			if(bindingResult1.hasErrors()||bindingResult2.hasErrors()) {

				
				modelAndView=boundResultService.boundResult(bindingResult1,bindingResult2);
				
				modelAndView.setViewName("user/Register");
				return modelAndView;
			}
			
			if(attributeService.foundDuplicateUsername(user.getUsername()))
			{
				modelAndView.addObject("username", "Username Already Exists");
				modelAndView.setViewName("user/Register");

				return modelAndView;
			}
			else if(attributeService.foundDuplicateEmail(user.getEmail()))
			{
				modelAndView.addObject("email","Email Already Exists");
				modelAndView.setViewName("user/Register");		
				return modelAndView;
			}
			else
			{
				
				userService.saveUser(user);
				System.out.println(patient);
				patientRegService.savePatient(patient);
				verificationService.save(user.getEmail());

				redirectAttributes.addFlashAttribute("email",user.getEmail());
				redirectAttributes.addAttribute("email",user.getEmail());
				return new ModelAndView("redirect:/verifyaccount");
			}
		
		}
		catch (Exception e) {
			// TODO: handle exception
			return new ModelAndView("user/Register");
		}
		
		
	}
	
	

}
