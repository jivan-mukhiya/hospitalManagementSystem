package com.HMS.Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HMS.model.Appointment;
import com.HMS.repository.AppointmentRepository;
import com.HMS.services.AppointmentServices;

@Service
public class AppointmentServicesImpl implements AppointmentServices{

	@Autowired
	private AppointmentRepository appointmentRepository;
	
	@Override
	public void addAppointment(Appointment appointment) {
		appointmentRepository.save(appointment);
	}

	@Override
	public List<Appointment> getAllAppointments() {
		
		return appointmentRepository.findAll();
	}

	@Override
	public Appointment findByid(int id) {
		
		return appointmentRepository.findById(id).get();
	}

}
