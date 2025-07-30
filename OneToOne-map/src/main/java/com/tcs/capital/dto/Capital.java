package com.tcs.capital.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Capital {
	
	@Id
	private int capId;
	private String capName;
	public int getCapId() {
		return capId;
	}
	public void setCapId(int capId) {
		this.capId = capId;
	}
	public String getCapName() {
		return capName;
	}
	public void setCapName(String capName) {
		this.capName = capName;
	}        
	
}
