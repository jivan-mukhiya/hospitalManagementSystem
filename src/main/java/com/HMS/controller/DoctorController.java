package com.HMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.HMS.model.Doctor;
import com.HMS.services.DoctorServices;
import com.HMS.services.SpecializationServices;

@Controller
public class DoctorController {

	@Autowired
	private DoctorServices doctorServices;
	@Autowired
	private SpecializationServices specializationServices;
	
	@GetMapping("/doctor")
	public String getDoctor(Model model) {
		
		model.addAttribute("sList", specializationServices.getAllSpecializations());
		return "doctor";
	}
	
	@PostMapping("/doctorForm")
	public String postDoctor(@ModelAttribute Doctor doctor) {
		doctorServices.addDoctor(doctor);
		return "doctor";
	}
	
	
}
