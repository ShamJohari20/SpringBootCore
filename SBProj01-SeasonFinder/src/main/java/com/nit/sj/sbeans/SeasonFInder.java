package com.nit.sj.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFInder {
	@Autowired
	private LocalDate date;

	public SeasonFInder() {
		System.out.println("SeasonFInder.SeasonFInder()");
	}
	
	public String findSeason() {
		
		int month = date.getMonthValue();
		
		if (month>=3 && month<=6) {
			return "Welcome To Summer Season";
		}
		
		if (month>=7 && month<=10) {
			return "Welcome To Rainy Season";
		}
		else {
			return "Welcome TO Winter Season";
		}

	}
	
}
