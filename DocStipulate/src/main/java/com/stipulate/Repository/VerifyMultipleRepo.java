package com.stipulate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stipulate.Entity.User;

@Repository
public interface VerifyMultipleRepo extends JpaRepository<User, Long>{

	public User  findByUsername(String username);
	public User   findByEmail(String email);
}
