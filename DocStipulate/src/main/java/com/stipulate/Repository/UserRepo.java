package com.stipulate.Repository;

import com.stipulate.Entity.User;
import com.stipulate.Repository.GenericRepo.EntitySaveGenRepo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepo extends EntitySaveGenRepo<User> {
    @Modifying
@Query("UPDATE User u SET u.status=:status WHERE u.email=:email")
void  updateStatus(@Param("status")Boolean status,@Param("email") String email);
}
