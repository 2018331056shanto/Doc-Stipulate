package com.stipulate.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stipulate.Entity.DoctorRegistration;
import com.stipulate.Repository.DoctorRegisterRepo;

@Service
public class DoctorRegisterService {

	@Autowired
	private DoctorRegisterRepo doctorRegisterRepo;
	
	@Transactional
	public void save(DoctorRegistration doctorRegistration) {
		
		doctorRegisterRepo.save(doctorRegistration);
		
	}

}
