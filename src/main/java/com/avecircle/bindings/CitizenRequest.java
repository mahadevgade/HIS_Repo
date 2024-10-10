package com.avecircle.bindings;

public class CitizenRequest {
	
	private String citizenName;
	private String citizenDob;
	private Long citizenSsn;
	
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public String getCitizenDob() {
		return citizenDob;
	}
	public void setCitizenDob(String citizenDob) {
		this.citizenDob = citizenDob;
	}
	public Long getCitizenSsn() {
		return citizenSsn;
	}
	public void setCitizenSsn(Long citizenSsn) {
		this.citizenSsn = citizenSsn;
	}
}
