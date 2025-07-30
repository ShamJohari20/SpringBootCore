package com.nit.sj.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder {
	@Autowired
	private LocalDate date;

	public WeekDayFinder() {
		System.out.println("WeekDayFinder.WeekDayFinder()");
	}
	
	public void getWeekDay() {
		
		DayOfWeek day =  date.getDayOfWeek();
		System.out.println(day);
	}
	
}
