package com.HMS.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.HMS.model.Appointment;
import com.HMS.services.AppointmentServices;

@Controller
public class ApproveAppointmentController {

	@Autowired
	private AppointmentServices appointmentServices;
	
	@GetMapping("/AppointmentApprove")
	public String getApproveAppointment(Model model) {
		List<Appointment> alist=appointmentServices.getAllAppointments();
		List<Appointment> finalList=new ArrayList<>();
		for(Appointment a:alist) {
			if(a !=null) {
				if(a.isStatus()==false) {
					finalList.add(a);
				}
			}
		}
		 model.addAttribute("aLsit",finalList);
		return "approveAppointment";
	}
	
	
	@GetMapping("/Approve")
	public String getApprove(@RequestParam int id) {
		Appointment a= appointmentServices.findByid(id);
		a.setStatus(true);
		appointmentServices.addAppointment(a);
		return "approveAppointment";
		}
	
}
