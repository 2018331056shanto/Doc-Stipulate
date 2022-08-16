package com.stipulate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stipulate.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
	public User findByUserName(String userName);
	public User findByEmail(String email);
}
