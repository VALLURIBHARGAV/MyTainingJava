package com.system.billing.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.billing.models.User;
import com.system.billing.repositories.UserRepository;

@Service
public class UserService {
	   @Autowired
	   UserRepository userRepository;
	
		public Iterable<User> getAllUsers(){
			return userRepository.findAll();
		}
		public User getUser(Long uId) {
			return userRepository.findById(uId).get();
		}
		public void updateUser(User uObj) {
			userRepository.save(uObj);
			System.out.println("Successfully User Registered.");
			return;
		}
		public String findRole(String userRole) {
			User user=userRepository.findByRole(userRole).get();
			return user.getRole();
			
		}
		public User findByUsernameAndPassword(String username,String password) {
			return userRepository.findByUsernameAndPassword(username,password);
		}
	}
