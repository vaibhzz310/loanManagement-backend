package com.vaibhav.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="loanApplication")
public class LoanApplication {

    public LoanApplication() {
    }

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long loanApplicationId;
	
	// Identifies a different user. A user who logs in is the Applicant.
    @NotNull
    @Column(name="loanApplicantUser", length=50, nullable=false, unique=false)
	private String loanApplicantUser;
	
	@NotNull
    @Column(name="loanApplicantName", length=50, nullable=false, unique=false)
	private String loanApplicantName;

    @NotNull
    @Column(name="address", length=50, nullable=false, unique=false)
	private String address;

    @NotNull
    @Column(name="emailAddress", length=50, nullable=false, unique=false)
	private String emailAddress;

    @NotNull
    @Column(name="contactNumber", length=50, nullable=false, unique=false)
	private String contactNumber;

    @NotNull
    @Column(name="loanAmount", length=50, nullable=false)
	private Integer loanAmount;
	
	@NotNull
    @Column(name="loanStartDate", length=50, nullable=false)
    @DateTimeFormat(pattern="dd/MM/yyyy")
	private Date loanStartDate;

    @NotNull
    @Column(name="loanExpiryDate", length=50, nullable=false)
    @DateTimeFormat(pattern="dd/MM/yyyy")
	private Date loanExpiryDate;

    @NotNull
    @Column(name="monthlyInstallment", length=50, nullable=false)
	private Integer monthlyInstallment;

    @NotNull
    @Column(name="paybackPeriod", length=50, nullable=false)
	private Integer paybackPeriod;
	

    public Long getLoanApplicationId() {
        return this.loanApplicationId;
    }

    public void setLoanApplicationId(Long loanApplicationId) {
        this.loanApplicationId = loanApplicationId;
    }

    public String getLoanApplicantUser() {
        return this.loanApplicantUser;
    }

    public void setLoanApplicantUser(String loanApplicantUser) {
        this.loanApplicantUser = loanApplicantUser;
    }

    public String getLoanApplicantName() {
        return this.loanApplicantName;
    }

    public void setLoanApplicantName(String loanApplicantName) {
        this.loanApplicantName = loanApplicantName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNumber() {
        return this.contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Integer getLoanAmount() {
        return this.loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanStartDate() {
        return this.loanStartDate;
    }

    public void setLoanStartDate(Date loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public Date getLoanExpiryDate() {
        return this.loanExpiryDate;
    }

    public void setLoanExpiryDate(Date loanExpiryDate) {
        this.loanExpiryDate = loanExpiryDate;
    }

    public Integer getMonthlyInstallment() {
        return this.monthlyInstallment;
    }

    public void setMonthlyInstallment(Integer monthlyInstallment) {
        this.monthlyInstallment = monthlyInstallment;
    }

    public Integer getPaybackPeriod() {
        return this.paybackPeriod;
    }

    public void setPaybackPeriod(Integer paybackPeriod) {
        this.paybackPeriod = paybackPeriod;
    }

}

// Sample JSON
// [
//   {
//     loanApplicantUser:"2018ucp1581@mnit.ac.in", 
//     loanApplicantName:Aman, 
//     address:"208, Sector 6, Delhi", 
//     emailAddress:"aqsw123@gmail.com", 
//     contactNumber:"5375846784", 
//     loanAmount:25000, 
//     loanStartDate:loanStartDate,
//     loanExpiryDate:loanExpiryDate,
//     monthlyInstallment:monthlyInstallment,
//     paybackPeriod:paybackPeriod
//   }
// ]