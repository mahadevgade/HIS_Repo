package com.avecircle.service;

import org.springframework.stereotype.Service;

import com.avecircle.bindings.CitizenRequest;
import com.avecircle.bindings.CitizenResponse;

@Service
public class CitizenServiceImpl implements CitizenService{

	@Override
	public CitizenResponse getStateName(CitizenRequest request) {
		
		CitizenResponse response=new CitizenResponse();
		Long ssn = request.getCitizenSsn();
		response.setCitizenSsn(ssn);
		String ssnNo = String.valueOf(ssn);
		
		if (ssnNo.startsWith("1")) {
			response.setStateName("New Jersey");
		}
		else if (ssnNo.startsWith("2")) {
			response.setStateName("Texas");
		}
		else if (ssnNo.startsWith("3")) {
			response.setStateName("Florida");
		}
		else if (ssnNo.startsWith("4")) {
			response.setStateName("Colorado");
		}
		else if (ssnNo.startsWith("5")) {
			response.setStateName("Rhode Island");
		}
		else if (ssnNo.startsWith("6")) {
			response.setStateName("California");
		}
		else if (ssnNo.startsWith("7")) {
			response.setStateName("Alaska");
		}
		else if (ssnNo.startsWith("8")) {
			response.setStateName("Albama");
		}
		else if (ssnNo.startsWith("9")) {
			response.setStateName("Ohio");
		}
		
		return response;
	}

}
