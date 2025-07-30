package com.human.heart.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.human.person.dto.Person;

@Entity
public class Heart {
	@Id
	private int hid;
	private String heartCondition;
	
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy ="heart")
	private Person person;


	public int getHid() {
		return hid;
	}


	public void setHid(int hid) {
		this.hid = hid;
	}


	public String getHeartCondition() {
		return heartCondition;
	}


	public void setHeartCondition(String heartCondition) {
		this.heartCondition = heartCondition;
	}


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
