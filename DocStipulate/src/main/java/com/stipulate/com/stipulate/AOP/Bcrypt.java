package com.stipulate.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class Bcrypt {
	@Before(value="execution(* com.stipulate.Controller.*.hello(..))")
	public void bcrypt() {
		System.out.println("i am aspact");
	}
	@After(value="execution(* com.stipulate.Controller.*.registerPage(..))")
	public void after() {
		System.out.println("afteer aspact");
	}
	

}
