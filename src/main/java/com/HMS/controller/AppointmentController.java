package com.HMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.HMS.model.Appointment;
import com.HMS.services.AppointmentServices;
import com.HMS.services.DoctorServices;

@Controller
public class AppointmentController {

	@Autowired
	private AppointmentServices appointmentServices;
	@Autowired
	private DoctorServices doctorServices;
	
	@GetMapping("/appointment")
	public String getAppointment(Model model) {
		
		model.addAttribute("dList", doctorServices.getAllDoctor());
		return "appointment";
	}
	
	
	@PostMapping("/appointmentForm")
	public String postAppointment(@ModelAttribute Appointment appointment) {
		appointment.setStatus(false);
		appointmentServices.addAppointment(appointment);
		return "Appointment";
	}
}
