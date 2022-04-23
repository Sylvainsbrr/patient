package com.mediscreen.patient.dao;

import com.mediscreen.patient.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientDao extends JpaRepository<Patient, Integer>, JpaSpecificationExecutor<Patient> {
    Patient findById(int id);
    List<Patient> findAll();
    Patient findByFirstNameAndLastName(String firstName, String lastName);
}