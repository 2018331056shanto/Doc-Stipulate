package com.stipulate.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.stipulate.Entity.DoctorRegistration;
import com.stipulate.Service.DoctorRegisterService;

@RestController
public class DoctorRegisterController {
	
	@Autowired
	private DoctorRegisterService doctorRegisterService;
	@GetMapping(value="register/doctor")
	public ModelAndView registerDoctorView() {
	
		return new ModelAndView("user/DoctorRegister");
	}
	@PostMapping(value = "register/doctor")
//	public ModelAndView registerDoctor(@ModelAttribute("registerDoctor") DoctorRegisterService doctorRegisterService,ModelMap modelMap,@RequestParam("registrationInfo.email") String lisence) {
//
//		System.out.println(lisence);
//		return new ModelAndView("user/DoctorRegister");
	
	public ModelAndView registerDoctor(@Validated @ModelAttribute("registerDoctor")DoctorRegistration doctorRegistration, BindingResult bindingResult,ModelMap modelMap) {
		
		ModelAndView modelAndView=new ModelAndView();
		System.out.println(doctorRegistration.getLisenceNumber());
		System.out.println(doctorRegistration.getEmail());
		try {
			if(bindingResult.hasErrors()) {
				List<FieldError> list=bindingResult.getFieldErrors();
				for (FieldError fieldError : list) {
					modelAndView.addObject(fieldError.getField(),fieldError.getDefaultMessage());
					System.out.println(fieldError.getField());
					System.out.println(fieldError.getDefaultMessage());
				}
				System.out.println("i dont know what to do");
				 modelAndView.setViewName("user/DoctorRegister");
				 return modelAndView;
			}
			doctorRegisterService.save(doctorRegistration);
			return new ModelAndView("extra/Verify");
			
			
		}
		catch(Exception exception) {
			System.out.println(exception.getMessage());
			 modelAndView.setViewName("user/DoctorRegister");
			 return modelAndView;
		}
		
		
		
	}
}
