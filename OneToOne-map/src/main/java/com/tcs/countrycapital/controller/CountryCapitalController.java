package com.tcs.countrycapital.controller;

import com.tcs.capital.dto.Capital;
import com.tcs.country.dto.Country;
import com.tcs.countrycapital.dao.CountryCapitalDao;

public class CountryCapitalController {
	public static void main(String[] args) {
		Country country=new Country();
		country.setCid(103);
		country.setName("China");
		country.setCode(+12);
		
		Capital capital=new Capital();
		capital.setCapId(1003);
		capital.setCapName("Xionoo");
		
//		country.setCapital(capital);
				
		CountryCapitalDao ccd=new CountryCapitalDao();
		
		ccd.saveCountry(country);
		ccd.saveCapital(capital);
//		ccd.updateCountry(country);
//		ccd.updateCapital(capital);
		
	}
}
