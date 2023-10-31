package com.system.billing.services;


import com.system.billing.models.Bill;
import com.system.billing.repositories.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillService {
	
	@Autowired
    BillRepository billRepository;

    
    public BillService(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    public List<Bill> getAllBills() {
        return billRepository.findAll();
    }

    public Optional<Bill> getBillById(int billId) {
        return billRepository.findById(billId);
    }

    public Bill createBill(Bill bill) {
        return billRepository.save(bill);
    }

    public Bill updateBill(Bill bill) {
        return billRepository.save(bill);
    }

    public void deleteBill(int billId) {
        billRepository.deleteById(billId);
    }
    
//    public Bill generateBillForPatient(Patient patient, Double bedCharges, Double wardCharges, Double treatmentCharges) {
//        // Calculate total charges here
//        Double totalAmount = bedCharges + wardCharges + treatmentCharges;
//
//        // Create a new bill
//        Bill bill = new Bill();
//        bill.setPatient(patient);
//        bill.setBedCharges(bedCharges);
//        bill.setWardCharges(wardCharges);
//        bill.setTreatmentCharges(treatmentCharges);
//        bill.setAmount(totalAmount);
//
//        // You can save the bill to the database using BillRepository.save() if needed
//
//        return bill;
//    }
    

    public void generateBillForPatient(Bill bill) {
    	double bedCharges = bill.getBedCharges();
    	double wardCharges = bill.getWardCharges();
    	double treatmentCharges = bill.getTreatmentCharges();
    	
    	double amount= bedCharges+ wardCharges+ treatmentCharges;
    	
    	Bill obj = new Bill(bill.getBillNumber(), bill.getBillDate(), bedCharges, wardCharges, treatmentCharges, bill.getPatient(), amount);
    	billRepository.save(obj);
    	
    }
}
