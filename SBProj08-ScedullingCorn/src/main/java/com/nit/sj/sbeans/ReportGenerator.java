package com.nit.sj.sbeans;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nit.sj.SbProj07ScedullingApplication;

@Component("rg")
public class ReportGenerator {
	
    public ReportGenerator() {
    	System.out.println("ReportGenerator.ReportGenerator()");
	}

//	@Scheduled(initialDelay=2000 , fixedDelay=2000)
//	@Scheduled(initialDelay=2000 , fixedRate = 2000)
	@Scheduled(cron="15 * * * * *")
	@Scheduled(cron="10 20 9-14 * * *")
	public void generator() {
		System.out.println("Report on  " + new Date());
	}
}
