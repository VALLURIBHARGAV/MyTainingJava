package com.system.billing.repositories;


import com.system.billing.models.Bill;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bill, Integer> {

	List<Bill> findByPatientId(Long patientId);
}
