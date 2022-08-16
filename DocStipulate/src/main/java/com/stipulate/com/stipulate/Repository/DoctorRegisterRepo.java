package com.stipulate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stipulate.Entity.DoctorRegistration;
import com.stipulate.Entity.LisenceNumberID;
import com.stipulate.Entity.RegistrationInfo;

@Repository
public interface DoctorRegisterRepo extends JpaRepository<DoctorRegistration,RegistrationInfo> {

	public DoctorRegistration  findByLisenceNumber(LisenceNumberID lisenceNumber);
//	public RegistrationInfo  findByEmail(RegistrationInfo email);
	
}
