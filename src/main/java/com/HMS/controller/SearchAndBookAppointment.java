package com.HMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.HMS.model.Appointment;
import com.HMS.model.Doctor;
import com.HMS.repository.AppointmentRepository;
import com.HMS.services.AppointmentServices;
import com.HMS.services.DoctorServices;
import com.HMS.services.SpecializationServices;

@Controller
public class SearchAndBookAppointment {

	@Autowired
	private AppointmentRepository appointmentRepository;
	@Autowired
	private DoctorServices doctorServices;
	@Autowired
	private SpecializationServices specializationServices;
	
	@Autowired
	private AppointmentServices appointmentServices;
	
	@GetMapping("/searchAndBookAppointment")
	public String getSaerchAndBookAppointment(Model model) {
		model.addAttribute("dList",doctorServices.getAllDoctor());
		model.addAttribute("sList",specializationServices.getAllSpecializations());
		return "searchAndBookAppointment";
	}
	
	@PostMapping("/SearchAppointment")
	public String searchAppointment(@ModelAttribute Doctor doctor,Model model) {
		
		model.addAttribute("aList",appointmentRepository.findByDoctor(doctor));
		return "searchAndBookAppointment";
	}
	
	@GetMapping("/book")
	public String reBook(@RequestParam int id) {
		Appointment appointment=appointmentServices.findByid(id);
		appointment.setStatus(false);
		appointmentServices.addAppointment(appointment);
		return "searchAndBookAppointment";
	}
	
}
