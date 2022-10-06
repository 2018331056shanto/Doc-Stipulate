package com.stipulate.AOP;


import java.util.UUID;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stipulate.Entity.Patient;
import com.stipulate.Entity.User;
import com.stipulate.Util.BcryptPasswordEncoder;
@Aspect
@Component
public class Bcrypt {
	
	@Autowired
	private BcryptPasswordEncoder bcryptPasswordEncoder;
	@Around("@annotation(com.stipulate.AOP.Annotation.Hash)")
	public Object HashExecuttionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
	{
		System.out.println("AOPPP");
		Object [] objectArgs=proceedingJoinPoint.getArgs();
//		System.out.println(objectArgs[1]);
		UUID uuid=UUID.randomUUID();
				
		try {
			
			User user=(User) objectArgs[0];
//			System.out.println(uuid);
			user.setId(uuid.toString());
//			System.out.println(user.getId());
			Patient patient=(Patient) objectArgs[2];
//			patient.setId(uuid.toString());
			patient.setUser(user);
			UUID uuid1=UUID.randomUUID();
			patient.setId(uuid1.toString());
			user.setPassword(bcryptPasswordEncoder.bcryptPasswordEncoder(user.getPassword()));
			user.setRole(bcryptPasswordEncoder.bcryptPasswordEncoder(user.getRole()));
//			System.out.println(user.getPassword());
//			System.out.println("I DONT'T KNOW "+objectArgs[1]);
			Object proceed=proceedingJoinPoint.proceed(objectArgs);
			return proceed;
			
		}
		catch (Exception e) {
			// TODO: handle exception
			Object proceed=proceedingJoinPoint.proceed(objectArgs);
			return proceed;
			
		}
		
		
		
		
		
	}
	

}
