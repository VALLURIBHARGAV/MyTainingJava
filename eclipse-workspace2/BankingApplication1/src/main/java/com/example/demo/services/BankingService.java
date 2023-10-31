package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Account;
import com.example.demo.entities.User;
import com.example.demo.repositories.AccountRespository;
import com.example.demo.repositories.UserRepository;

public class BankingService {
	@Autowired
    private UserRepository userRepository;
    
    @Autowired
    private AccountRespository accountRepository;
    
    public User createUser(String userId, String password) {
        User user = new User(userId, password);
        userRepository.save(user);

        Account account = new Account(generateAccountNumber(), 0.0);
        account.setUser(user);
        accountRepository.save(account);

        return user;
    }
    private String generateAccountNumber() {
        // Generate a unique account number using a more robust method in a real application
        return "ACCT-" + System.currentTimeMillis();
    }
    
    public boolean login(Long userId) {
      Optional<User> user = userRepository.findById(userId );
      return user != null;
  }
	
}
