package com.nit.sj.service;

import java.util.List;

import com.nit.sj.model.Employee;

public interface IEmployeeService {
	
	public String  registerEmployee(Employee emp) throws Exception;
	public List<Employee> fetchAllEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception ;
	
}
