package com.nit.sj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("institude")
@Data
public class Institude {
	
	@Value("#{student}")
	private Student student;
	
	@Value("${inst.name}")
	private String instName;
	
    @Value("#{student.stuCourseFee - 2000}")
	private Double discountedFees;
	
	
	
	public String idCard() {
        return instName + " --> " + student + " | With Discount: " + discountedFees;
	}
}
