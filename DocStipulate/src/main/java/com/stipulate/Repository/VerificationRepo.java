package com.stipulate.Repository;

import com.stipulate.Entity.Verification;
import com.stipulate.Repository.GenericRepo.EntitySaveGenRepo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface VerificationRepo extends EntitySaveGenRepo<Verification> {

	@Query(value = "SELECT u.token FROM verification u WHERE u.email=:email AND u.timestamp >= CURRENT_TIMESTAMP() - INTERVAL 10 MINUTE",nativeQuery = true)
String findToken(@Param("email")String email);
}
