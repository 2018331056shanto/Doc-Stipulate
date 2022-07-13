package com.stipulate.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSenderService {
	@Autowired
	private JavaMailSender mailsender;
	
	public void sendEmail(String toEmail,String token)
	{
		SimpleMailMessage message=new SimpleMailMessage();
		message.setFrom("ashraful185058@gmail.com");
		message.setTo(toEmail);
		message.setSubject("Account Verification");
		message.setText("Here is the code to verify your account :"+token);
		mailsender.send(message);
	}
	
}
