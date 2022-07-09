package com.stipulate.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stipulate.Entity.User;
import com.stipulate.Repository.UserRepo;
import com.stipulate.Util.BcryptPasswordEncoder;

@Service
public class UserService {
@Autowired
private BcryptPasswordEncoder bcryptPasswordEncoder;	
@Autowired
private UserRepo repo;
public User findByUserName(String username) {
	
	return repo.findByUserName(username);
}
public User findByEmail(String email) {
	
	return repo.findByEmail(email);
}
public boolean bcryptPasswordDecoder(String password,String encodedPassword) {
	
	boolean match=bcryptPasswordEncoder.bcryptPasswordDecoder(password, encodedPassword);
	return match;
}

@Transactional
public void save(User user) {
	
	user.setPassword(bcryptPasswordEncoder.bcryptPasswordEncoder(user.getPassword()));
	System.out.println(user.getPassword());
	repo.save(user);
}
}
	


