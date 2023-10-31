package com.system.billing.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.billing.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	  User findByUsername(String username);

	Optional<User> findByRole(String userRole);

	User findByUsernameAndPassword(String username, String password);
	}