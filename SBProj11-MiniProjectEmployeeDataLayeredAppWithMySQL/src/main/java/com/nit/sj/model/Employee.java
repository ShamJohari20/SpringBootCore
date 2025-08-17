package com.nit.sj.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Employee {
	private Integer eid;
	@NonNull
	private String ename;
	@NonNull
	private String desg;
	@NonNull
	private Double salary;
	private Double grossSalary;
	private Double netSalary;

}
