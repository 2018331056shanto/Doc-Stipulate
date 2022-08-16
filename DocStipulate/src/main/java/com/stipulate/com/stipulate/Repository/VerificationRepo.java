package com.stipulate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stipulate.Entity.Verification;

public interface VerificationRepo extends JpaRepository<Verification, String> {
	

}
