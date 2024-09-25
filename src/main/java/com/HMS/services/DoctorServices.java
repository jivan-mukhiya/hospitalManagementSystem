package com.HMS.services;

import java.util.List;

import com.HMS.model.Doctor;

public interface DoctorServices {

	void addDoctor(Doctor  doctor);
	List<Doctor> getAllDoctor();
}
