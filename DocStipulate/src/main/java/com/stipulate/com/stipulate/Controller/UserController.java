package com.stipulate.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@GetMapping("home")
	public ModelAndView login()
	{System.out.println("hello bro how are you ");
		
		ModelAndView mv=new ModelAndView("user/Login");
		String name="Shanto0";
		mv.addObject("name",name);
//		mv.setViewName("Login");
		System.out.println(mv);
		return mv;
	}
	
	

}
