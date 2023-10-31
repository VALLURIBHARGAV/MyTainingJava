package com.system.billing.services;



 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.billing.models.Doctor;
import com.system.billing.repositories.DoctorRepository;
 

 
 
 
 
@Service
public class DoctorService {
    
	@Autowired
   DoctorRepository doctorRepository;
 
    
    //list
    public Iterable<Doctor> getAllDoctor() {
        return doctorRepository.findAll();
    }
    
    //select
    public Doctor getDoctorById(int id) {
        return doctorRepository.findById(id).orElse(null);
    }
    
    
    //insertion
    public void addDoctor(Doctor doctor) {
    	doctorRepository.save(doctor);
    }
    
   public void updateDoctor(Doctor doctor) {
  
	   doctorRepository.save(doctor);
   
}
 
    
    public void deleteDoctor(int id) {
    	doctorRepository.deleteById(id);
    }
    
}