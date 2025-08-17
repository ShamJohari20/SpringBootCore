package com.nit.sj.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("student")
@Data
public class Student {
	
	@Value("${stu.id}")
	private Integer stuId;
	
	@Value("${stu.name}")
	private String stuName;
	
	@Value("${stu.course}")
	private String stuCourse;
	
	@Value("${stu.courseFee}")
	private Double stuCourseFee;
	
	
}
