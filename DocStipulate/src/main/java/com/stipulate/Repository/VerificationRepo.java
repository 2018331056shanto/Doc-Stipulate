package com.stipulate.Repository;

import com.stipulate.Entity.User;
import com.stipulate.Entity.Verification;
import com.stipulate.Repository.GenericRepo.EntitySaveGenRepo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VerificationRepo extends EntitySaveGenRepo<Verification> {

	@Query("SELECT u.token FROM Verification u WHERE u.email=:email")
String findToken(@Param("email")String email);
}
