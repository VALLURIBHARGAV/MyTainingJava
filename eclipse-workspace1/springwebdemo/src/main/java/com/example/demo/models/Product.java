package com.example.demo.models;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prdId;
	private String prdName;
	private double prdPrice;
	
	
	public Product() {
		super();
	}


	public Product(int prdId, String prdName, double prdPrice) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
	}

	public Product( String prdName, double prdPrice) {
		super();
		this.prdName = prdName;
		this.prdPrice = prdPrice;
	}
	public int getPrdId() {
		return prdId;
	}


	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}


	public String getPrdName() {
		return prdName;
	}


	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}


	public double getPrdPrice() {
		return prdPrice;
	}


	public void setPrdPrice(double prdPrice) {
		this.prdPrice = prdPrice;
	}


	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdPrice=" + prdPrice + "]";
	}
	
	
	
	
}
