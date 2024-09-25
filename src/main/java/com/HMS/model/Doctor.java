package com.HMS.model;

import java.io.File;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Doctor_tbl")
public class Doctor {

	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String address;
	private long phone;
	private String gender;
	private String note;
	private File photo;
	
	@ManyToMany
	@JoinTable(name = "doc_spe_tbl",joinColumns =  {@JoinColumn(name="docId")},
			inverseJoinColumns = {@JoinColumn(name="specId")})
	private List<Specialization> specialization;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public File getPhoto() {
		return photo;
	}

	public void setPhoto(File photo) {
		this.photo = photo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Specialization> getSpecialization() {
		return specialization;
	}

	public void setSpecialization(List<Specialization> specialization) {
		this.specialization = specialization;
	}

	
	
	
	
}
