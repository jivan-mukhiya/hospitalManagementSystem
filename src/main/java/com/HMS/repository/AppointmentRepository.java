package com.HMS.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HMS.model.Appointment;
import com.HMS.model.Doctor;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

	List<Appointment> findByDoctor(Doctor doctor);
}
