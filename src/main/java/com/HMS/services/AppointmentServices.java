package com.HMS.services;

import java.util.List;

import com.HMS.model.Appointment;

public interface AppointmentServices {

	
	void addAppointment(Appointment  appointment);
	List<Appointment> getAllAppointments();
	
	Appointment findByid(int id) ;
		
	
}
