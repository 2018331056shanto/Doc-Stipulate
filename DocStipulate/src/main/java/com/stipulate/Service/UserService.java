package com.stipulate.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stipulate.Entity.User;
import com.stipulate.Repository.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Transactional
	public void saveUser(User user) {
		
		userRepo.save(user);
	}

}
	


