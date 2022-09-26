package com.stipulate.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stipulate.Entity.Patient;
import com.stipulate.Repository.PatientRepo;

@Service
public class PatientRegService   {

	@Autowired
	private PatientRepo patientRepo;
	

	@Transactional
	public void savePatient(Patient patient) {

		patientRepo.save(patient);
		
	
	
	}
	

}
