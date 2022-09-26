package com.stipulate.Service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stipulate.Entity.User;
import com.stipulate.Repository.VerifyMultipleRepo;


@Service
public class VerifyMultpleAttributeService {
	
@Autowired
private VerifyMultipleRepo multipleRepo;

public boolean foundDuplicateUsername(String username) {
	
	
	User duplicateUser=multipleRepo.findByUsername(username);
//	System.out.println("found duplicateUsername()");
//	System.out.println(Objects.nonNull(duplicateUser));
	return Objects.nonNull(duplicateUser);
	
	
}
public boolean foundDuplicateEmail(String email) {

	User duplicateUser=multipleRepo.findByEmail(email);
//	System.out.println("found duplicateEmail()");
//	System.out.println(Objects.nonNull(duplicateUser));
	return Objects.nonNull(duplicateUser);
	
}

	
}
