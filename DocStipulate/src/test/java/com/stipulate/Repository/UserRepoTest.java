package com.stipulate.Repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import  com.stipulate.Entity.User;
@SpringBootTest
public class UserRepoTest {

	@Autowired
	private UserRepo userRepo;
	@Test
	public void saveUser()
	{
		
		User user=new User();
		user.setfName("ashraful ");
		user.setlName("Islam Shanto");
		user.setPassword("i am shanttoooo");
		user.setProfilePic("hellllllo");
		user.setEmail("ashraful@gmail.com");
		user.setUserName("shanto12345");
		
		userRepo.save(user);
	}

}
