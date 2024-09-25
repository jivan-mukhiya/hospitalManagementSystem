package com.HMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.HMS.services.AppointmentServices;

@Controller
public class ViewAppointmentStatusController {

	@Autowired
	private AppointmentServices appointmentServices;
	
	@GetMapping("/AppointmentStatus")
	public String getAppointStatus(Model model) {
		model.addAttribute("aList",appointmentServices.getAllAppointments());
		return "viewAppointmentStatus";
	}
}
