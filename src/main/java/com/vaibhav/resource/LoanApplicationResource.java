package com.vaibhav.resource;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vaibhav.domain.LoanApplication;
//import com.vaibhav.resource.Resource;
import com.vaibhav.service.LoanApplicationService;

@CrossOrigin(origins = "https://loan-management-22.herokuapp.com/list")
@RestController
@RequestMapping("/loanApplication")
public class LoanApplicationResource implements Resource<LoanApplication> {
	
	@Autowired
	private LoanApplicationService loanApplicationService;

	@Override
	public ResponseEntity<Collection<LoanApplication>> findAll() {
		return new ResponseEntity<>(loanApplicationService.findAll(), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<LoanApplication> findById(Long id) {
		return new ResponseEntity<>(loanApplicationService.findById(id), HttpStatus.OK);
	}

    @GetMapping("user/{loanApplicantUser}")
    public ResponseEntity<Collection<LoanApplication>> findByLoanApplicantUser(@PathVariable String loanApplicantUser) {
		return new ResponseEntity<>(loanApplicationService.findByLoanApplicantUser(loanApplicantUser), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<LoanApplication> save(LoanApplication loanApplication) {
		return new ResponseEntity<>(loanApplicationService.saveOrUpdate(loanApplication), HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<LoanApplication> update(LoanApplication loanApplication) {
		return new ResponseEntity<>(loanApplicationService.saveOrUpdate(loanApplication), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> deleteById(Long id) {
		return new ResponseEntity<>(loanApplicationService.deleteById(id), HttpStatus.OK);
	}

}



//Requests
// {

// }
