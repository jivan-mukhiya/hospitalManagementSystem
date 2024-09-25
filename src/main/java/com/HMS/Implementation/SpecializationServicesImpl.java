package com.HMS.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HMS.model.Specialization;
import com.HMS.repository.SpecializationRepository;
import com.HMS.services.SpecializationServices;

@Service
public class SpecializationServicesImpl implements SpecializationServices{

	@Autowired
	private SpecializationRepository  specializationRepository;
	
	@Override
	public void addSpecialization(Specialization specialization) {
		specializationRepository.save(specialization);
		
	}

	@Override
	public List<Specialization> getAllSpecializations() {
		
		return specializationRepository.findAll();
	}

}
