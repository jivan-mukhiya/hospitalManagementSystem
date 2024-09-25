package com.HMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.HMS.model.Specialization;
import com.HMS.services.SpecializationServices;

@Controller
public class SpecializationController  {

	@Autowired
	private SpecializationServices specializationServices;
	
	@GetMapping("/specialization")
	public String getSpecialization() {
		return "specialization";
	}
	
	@PostMapping("/SpecializationForm")
	public String postSpecialization(@ModelAttribute Specialization specialization) {
		specializationServices.addSpecialization(specialization);
		return "specialization";
	}
}
