package com.system.billing.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.billing.models.Patient;
import com.system.billing.repositories.PatientRepository;
 




@Service
public class PatientService {
    @Autowired
    PatientRepository patientRepository;

    
    public List<Patient> getAllPatients() {
		ArrayList<Patient> PatientList = new ArrayList<>();
		patientRepository.findAll().forEach(patient -> PatientList.add(patient));
		
		return PatientList;
	}
	
	public Patient getPatientById(int id) {
		return patientRepository.findById(id).get();
	}
	
	public boolean updateStatus(int id) {
		Patient patient = getPatientById(id);
		//patient.setStatus("Completed");
		
		return saveOrUpdatePatient(patient);
	}
	
	public boolean saveOrUpdatePatient(Patient patient) {
		Patient updatedPatient = patientRepository.save(patient);
		
		if (getPatientById(updatedPatient.getId()) != null) {
			return true;
		}
		
		return false;
	}
	
	public boolean deletePatient(int id) {
		patientRepository.deleteById(id);
		
		if (patientRepository.findById(id).isEmpty()) {
			return true;
		}
		
		return false;
	}
    
}
