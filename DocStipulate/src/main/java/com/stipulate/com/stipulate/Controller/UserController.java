package com.stipulate.Controller;

import java.util.List;
import java.util.Objects;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.stipulate.Entity.User;
import com.stipulate.Service.UserService;

@RestController
public class UserController  {
	@Autowired
	UserService userService;
	
	@GetMapping(value="")
	public ModelAndView login() {
		
		return new ModelAndView("user/Login");
	}
	@PostMapping(value="/login")
	public ModelAndView login(Model model) {
		
		ModelAndView modelAndView=new ModelAndView();
		
		return modelAndView;
	}
	
	@GetMapping(value = "/register")
	public ModelAndView registerPage (ModelMap modelMap,String error ) {
		ModelAndView mv=new ModelAndView("user/Register");
		System.out.println("hello how are you");
		return mv;
	}
	@PostMapping(value="/register")
	public ModelAndView register(@Validated @ModelAttribute("register") User user,BindingResult bindingResult,ModelMap modelMap) {
		System.out.println(user.getEmail());
		ModelAndView modelAndView=new ModelAndView();
		try {
			if(bindingResult.hasErrors()) {
			List<FieldError> list=bindingResult.getFieldErrors();
			for (FieldError fieldError : list) {
				modelAndView.addObject(fieldError.getField(),fieldError.getDefaultMessage());
				System.out.println(fieldError.getField());
				System.out.println(fieldError.getDefaultMessage());
			}
			
			}
			if(foundDuplicateUsername(user.getUserName()))
			{
				modelAndView.addObject("userName", "Username Already Exists");
				modelAndView.setViewName("user/Register");
				System.out.println("duplicate username");
				return modelAndView;
			}
			else if(foundDuplicateEmail(user.getEmail()))
			{
				modelAndView.addObject("email","Email Already Exists");
				modelAndView.setViewName("user/Register");
				System.out.println("duplicate email");
				return modelAndView;
			}
			else
			{
				userService.save(user);
				System.out.println("hello i am error");
				return new ModelAndView("redirect:/");
			}
			
			
		}
		catch(Exception exception) {
			System.out.println("i am from catch");
			 modelAndView.setViewName("user/Register");
			return modelAndView;
		}
		
		
	}
	
@PostConstruct
public void helloBro()
{
	System.out.println("i am post construct");
}
@PreDestroy
public void destroy()
{
	System.out.println("i am pre destroy");
}

private boolean foundDuplicateUsername(String username) {
	
	User duplicateUser=userService.findByUserName(username);
	System.out.println("found duplicateUsername()");
	System.out.println(Objects.nonNull(duplicateUser));
	return Objects.nonNull(duplicateUser);
}
private boolean foundDuplicateEmail(String email) {
	
	User duplicateUser=userService.findByEmail(email);
	System.out.println("found duplicateEmail()");
	System.out.println(Objects.nonNull(duplicateUser));
	return Objects.nonNull(duplicateUser);
}


}
