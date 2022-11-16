package com.stipulate.Service;

import java.sql.Timestamp;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stipulate.Entity.Verification;
import com.stipulate.Repository.VerificationRepo;

@Service
public class VerificationService {

	@Autowired
	private VerificationRepo verificationRepo;
	@Autowired
	private MailSenderService mailSenderService;
	
	Verification verification=new Verification();
	
	

	@Transactional
	public <T> void save(T element) {
		
	System.out.println(element);
	Random rnd = new Random();
	int number= rnd. nextInt(999999);
	String token=String.valueOf(number);
	Timestamp timestamp=new Timestamp(11222);
	UUID ID=UUID.randomUUID();
	verification.setId(String.valueOf(ID));
	verification.setEmail(element);
	verification.setToken(token);
	verification.setCreatedAt(timestamp);
	verificationRepo.save(verification);	
//	redirectAttributes.addFlashAttribute("verification",verification);
//	System.out.println("i am from whome11!!");
	mailSenderService.sendEmail(element, token);
		
	}

	public Boolean verifyCode(String email,String code)
	{

		code = code.replaceAll("\\s", "");
		String token=(String) verificationRepo.findToken(email);
//		System.out.println("hello how are you"+token);


		Integer tok=Integer.parseInt(token);
		Integer cod=Integer.parseInt(code);
		System.out.println("diff : "+(cod-tok));
		if(tok.equals(cod))
		{
			return  true;
		}
		else {
			return  false;
		}
	}
}
