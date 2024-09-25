package com.HMS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Appointment_tbl")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int slots;
	private String details;
	private double consultationFee;
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name = "docId")
	private Doctor doctor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSlots() {
		return slots;
	}

	public void setSlots(int slots) {
		this.slots = slots;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getConsultationFee() {
		return consultationFee;
	}

	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
