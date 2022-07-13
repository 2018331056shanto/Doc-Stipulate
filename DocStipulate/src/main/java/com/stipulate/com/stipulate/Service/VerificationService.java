package com.stipulate.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stipulate.Entity.Verification;
import com.stipulate.Repository.VerificationRepo;

@Service
public class VerificationService {

	@Autowired
	private VerificationRepo verificationRepo;
	
	@Transactional
	public void save(Verification verification) {
		
		verificationRepo.save(verification);
	}

}
