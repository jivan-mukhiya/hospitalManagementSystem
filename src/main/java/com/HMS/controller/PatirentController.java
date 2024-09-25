package com.HMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.HMS.model.Patient;
import com.HMS.services.PatientServices;

@Controller
public class PatirentController {

	
	@Autowired
	private PatientServices patientServices;
	
	@GetMapping("/patient")
	public String getPatient() {
		return "patient";
	}
	
	@PostMapping("/patientForm")
	public String postPatient(@ModelAttribute Patient patient) {
		patientServices.addPatient(patient);
		
		
		return "patient";
		
	}
	
}
