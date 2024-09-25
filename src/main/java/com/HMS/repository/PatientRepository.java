package com.HMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HMS.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{
	
}
