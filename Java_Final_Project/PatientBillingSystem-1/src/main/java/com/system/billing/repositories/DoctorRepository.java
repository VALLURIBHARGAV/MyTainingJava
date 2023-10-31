package com.system.billing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.billing.models.Doctor;
 

 
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}