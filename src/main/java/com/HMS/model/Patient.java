package com.HMS.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Patient_tbl")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fname;
	private String lname;
	private String gender;
	private long phone;
	private LocalDate dob;
	private String marialSatus;
	private String presentAddress;
	private String communicationAddress;
	private List<String> pastMedicalHistory;
	private String otherDeatils;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getMarialSatus() {
		return marialSatus;
	}
	public void setMarialSatus(String marialSatus) {
		this.marialSatus = marialSatus;
	}
	public String getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
	public String getCommunicationAddress() {
		return communicationAddress;
	}
	public void setCommunicationAddress(String communicationAddress) {
		this.communicationAddress = communicationAddress;
	}
	public List<String> getPastMedicalHistory() {
		return pastMedicalHistory;
	}
	public void setPastMedicalHistory(List<String> pastMedicalHistory) {
		this.pastMedicalHistory = pastMedicalHistory;
	}
	public String getOtherDeatils() {
		return otherDeatils;
	}
	public void setOtherDeatils(String otherDeatils) {
		this.otherDeatils = otherDeatils;
	}
	
	
	
	
	
}
