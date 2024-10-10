package com.avecircle.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.avecircle.bindings.CitizenRequest;
import com.avecircle.bindings.CitizenResponse;
import com.avecircle.service.CitizenService;

@RestController
public class CitizenRest {
	
	@Autowired
	private CitizenService service;
	
	@PostMapping("/ssa")
	public ResponseEntity<CitizenResponse> getStateName(@RequestBody CitizenRequest request)
	{
		CitizenResponse stateName = service.getStateName(request);
		return new ResponseEntity<CitizenResponse>(stateName, HttpStatus.OK);
	}

	@GetMapping("/ssa/{ssn}")
	public String findStateName(@PathVariable("ssn") String ssnNo)
	{
		if (ssnNo.startsWith("1")) {
			return "New Jersey";
		}
		else if (ssnNo.startsWith("2")) {
			return"Texas";
		}
		else if (ssnNo.startsWith("3")) {
			return "Florida";
		}
		else if (ssnNo.startsWith("4")) {
			return "Colorado";
		}
		else if (ssnNo.startsWith("5")) {
			return "Rhode Island";
		}
		else if (ssnNo.startsWith("6")) {
			return "California";
		}
		else if (ssnNo.startsWith("7")) {
			return "Alaska";
		}
		else if (ssnNo.startsWith("8")) {
			return "Albama";
		}
		else if (ssnNo.startsWith("9")) {
			return "Ohio";
		}
		else {
			return "Invalid SSN";
		}
	}
}

