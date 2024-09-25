package com.HMS.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HMS.model.Patient;
import com.HMS.repository.PatientRepository;
import com.HMS.services.PatientServices;

@Service
public class PatientServicesImplementation implements PatientServices{
@Autowired
private PatientRepository patientRepository;
	
	@Override
	public void addPatient(Patient patient) {
		
		patientRepository.save(patient);
	}

}
