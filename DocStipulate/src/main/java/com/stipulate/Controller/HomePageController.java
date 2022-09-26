package com.stipulate.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomePageController {
	@GetMapping(value="/")
	public ModelAndView home() {
				
		
		return new ModelAndView("Home/HomePage");
		
	}

}
