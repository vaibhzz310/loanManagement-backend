package com.vaibhav.service;

import java.util.Collection;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaibhav.domain.LoanApplication;
import com.vaibhav.repository.LoanApplicationRepository;
// import com.vaibhav.service.IService;

@Service
public class LoanApplicationService implements IService<LoanApplication> {
	
	@Autowired
	private LoanApplicationRepository loanApplicationRepository;

	@Override
	public Collection<LoanApplication> findAll() {
		return loanApplicationRepository.findAll();
	}

	@Override
	public LoanApplication findById(Long id) {
		return loanApplicationRepository.findById(id).get();
	}

	public Collection<LoanApplication> findByLoanApplicantUser(String LoanApplicantUser){
		return loanApplicationRepository.findByLoanApplicantUser(LoanApplicantUser);
	}

	@Override
	public LoanApplication saveOrUpdate(LoanApplication LoanApplication) {
		return loanApplicationRepository.saveAndFlush(LoanApplication);
	}

	@Override
	public String deleteById(Long id) {
		JSONObject jsonObject = new JSONObject();
		try {
			loanApplicationRepository.deleteById(id);
			jsonObject.put("message", "LoanApplication deleted successfully");
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return jsonObject.toString();
	}

}
