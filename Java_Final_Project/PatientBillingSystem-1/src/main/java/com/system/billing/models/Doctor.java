package com.system.billing.models;

import java.util.List;

import jakarta.persistence.*;

 
@Entity
@Table(name = "doctors")  // Specify the table name in the database
public class Doctor {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "docid")  // Map to the 'id' column in the 'patients' table
    private int docid;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "specialization")
    private String specialization;
    
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Patient> patients;
    
    public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
    public Doctor(int id, String name, String specialization) {
		super();
		this.docid = id;
		this.name = name;
		this.specialization = specialization;
	}
    
    public int getId() {
		return docid;
	}
	public void setId(int id) {
		this.docid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
}