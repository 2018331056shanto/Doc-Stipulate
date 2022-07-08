package com.stipulate.Util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class BcryptPasswordEncoder {
	
	public String bcryptPasswordEncoder(String password) {
		
		BCryptPasswordEncoder bCryptPassword=new BCryptPasswordEncoder();
		String hashPassword=bCryptPassword.encode(password);
		return hashPassword;
		
	}
	
	
}
