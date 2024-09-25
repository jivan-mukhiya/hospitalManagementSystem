package com.HMS.services;

import java.util.List;

import com.HMS.model.Specialization;

public interface SpecializationServices {

	void addSpecialization(Specialization specialization);
	List<Specialization> getAllSpecializations();
}
