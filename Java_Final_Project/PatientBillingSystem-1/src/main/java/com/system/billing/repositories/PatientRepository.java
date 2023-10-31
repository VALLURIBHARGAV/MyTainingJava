package com.system.billing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.billing.models.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
 
}
