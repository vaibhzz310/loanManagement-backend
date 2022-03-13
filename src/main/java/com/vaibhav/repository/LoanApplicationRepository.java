package com.vaibhav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

import com.vaibhav.domain.LoanApplication;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {
    Collection<LoanApplication> findByLoanApplicantUser(String LoanApplicantUser);
}