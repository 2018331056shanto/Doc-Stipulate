package com.stipulate.Service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.servlet.ModelAndView;

@Component
public class BoundResultService {

	public ModelAndView boundResult(BindingResult... bindingResult) {
		ModelAndView modelAndView=new ModelAndView();
//		System.out.println(bindingResult.length);
		
		for(BindingResult bindingResult2: bindingResult) {
			
			List<FieldError> list=bindingResult2.getFieldErrors();
			
			for (FieldError fieldError : list) {
				modelAndView.addObject(fieldError.getField(),fieldError.getDefaultMessage());
		}
			
		}

		return modelAndView;
	}
}
