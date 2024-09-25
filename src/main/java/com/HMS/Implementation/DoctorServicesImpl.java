package com.HMS.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HMS.model.Doctor;
import com.HMS.repository.DoctorRepository;
import com.HMS.services.DoctorServices;

@Service
public class DoctorServicesImpl implements DoctorServices{

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Override
	public void addDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
		
	}

	@Override
	public List<Doctor> getAllDoctor() {
		
		return doctorRepository.findAll();
	}

}
