package com.HMS.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.HMS.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

}
