package com.nit.sj.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WIshMessageGenerator {
	@Autowired
	private LocalTime time;

	public WIshMessageGenerator() {
		System.out.println("WIshMessageGenerator.WIshMessageGenerator()");
	}
	
	public String getWishmessage() {
		System.out.println("WIshMessageGenerator.getWishmessage()");
		int hour = time.getHour();
		if (hour>=4 && hour<=12) {
			return "Good Morning";
		}else if(hour>=12 && hour<=17){
			return "Good Afternoon";
		}else if(hour>=17 && hour<=21){
			return "Good Evening";
			
		}else {
			return "Good Night";
			
		}
		
	}
	
	
}
