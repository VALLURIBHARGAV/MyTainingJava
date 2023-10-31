package com.example.demo.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="UserTable")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long uId;
	private String userId;
	private String password;
	
	@OneToMany(mappedBy = "user")
	private List<Account> account;
	
	
	
	public User() {
		super();
	}
	

	public User(long uId, String userId, String password) {
		super();
		this.uId = uId;
		this.userId = userId;
		this.password = password;
	}


	public User( String userId, String password) {
		super();
		this.userId = userId;
		this.password = password;
	}

	public long getUId() {
		return uId;
	}

	public void setUid(long uId) {
		this.uId = uId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public long getuId() {
		return uId;
	}


	public void setuId(long uId) {
		this.uId = uId;
	}


	public List<Account> getAccount() {
		return account;
	}


	public void setAccount(List<Account> account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "User [id=" + uId + ", userId=" + userId + ", password=" + password + "]";
	}
	
}
