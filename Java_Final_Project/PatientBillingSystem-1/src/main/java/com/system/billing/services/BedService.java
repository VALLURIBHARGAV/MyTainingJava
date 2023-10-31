package com.system.billing.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.billing.models.Bed;
import com.system.billing.repositories.BedRepository;



@Service
public class BedService {
    
	@Autowired
   BedRepository bedRepository;
 
    
    //list
    public Iterable<Bed> getAllBed() {
        return bedRepository.findAll();
    }
    
    //select
    public Bed getBedById(int id) {
        return bedRepository.findById(id).orElse(null);
    }
    
    
    //insertion
    public void addBed(Bed bed) {
    	bedRepository.save(bed);
    }
    
   public void update(Bed doctor) {
  
	   bedRepository.save(doctor);
   
}
 
    
    public void deleteBed(int id) {
    	bedRepository.deleteById(id);
    }
    
}
