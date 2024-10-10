package com.avecircle.service;

import com.avecircle.bindings.CitizenRequest;
import com.avecircle.bindings.CitizenResponse;

public interface CitizenService {
	
	public CitizenResponse getStateName(CitizenRequest request);

}
