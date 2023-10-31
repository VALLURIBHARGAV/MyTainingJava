package com.system.billing.models;

import jakarta.persistence.*;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "bills")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "billid")
    private int id;

    @Column(name = "bill_number")
    private String billNumber;

    @Column(name = "bill_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date billDate;

    @Column(name = "amount")
    private double amount;

    @ManyToOne
    @JoinColumn(name = "patid")
    private Patient patient;

    @Column(name = "bed_charges")
    private double bedCharges;

    @Column(name = "ward_charges")
    private double wardCharges;

    @Column(name = "treatment_charges")
    private double treatmentCharges;

    public Bill() {
    }

    public Bill(String billNumber, Date billDate, double bedCharges, double wardCharges, double treatmentCharges, Patient patient, double amount) {
        this.billNumber = billNumber;
        this.billDate = billDate;
        this.bedCharges = bedCharges;
        this.wardCharges = wardCharges;
        this.treatmentCharges = treatmentCharges;
        this.amount = bedCharges + wardCharges + treatmentCharges;
        this.patient = patient;
    }
    
    

	public Bill(double amount, double bedCharges, double wardCharges, double treatmentCharges) {
		super();
		this.amount = amount;
		this.bedCharges = bedCharges;
		this.wardCharges = wardCharges;
		this.treatmentCharges = treatmentCharges;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public double getBedCharges() {
		return bedCharges;
	}

	public void setBedCharges(double bedCharges) {
		this.bedCharges = bedCharges;
	}

	public double getWardCharges() {
		return wardCharges;
	}

	public void setWardCharges(double wardCharges) {
		this.wardCharges = wardCharges;
	}

	public double getTreatmentCharges() {
		return treatmentCharges;
	}

	public void setTreatmentCharges(double treatmentCharges) {
		this.treatmentCharges = treatmentCharges;
	}

    // Other getters and setters as needed

    
    
}
