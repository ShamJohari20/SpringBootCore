package com.nit.sj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.sj.model.Employee;
import com.nit.sj.service.EmployeeServiceImpli;

@Controller("econtroller")
public class PayrollOperationsController {

	@Autowired()
	EmployeeServiceImpli employeeServiceImpli;

	public PayrollOperationsController() {
		System.out.println("PayrollOperationsController.PayrollOperationsController()");
	}
	
	public String processEmployee(Employee emp) throws Exception{
		return employeeServiceImpli.registerEmployee(emp);
	}

	public List<Employee> showAllEMployeeByDesg(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("PayrollOperationsController.showAllEMployeeByDesg()");

		List<Employee> list = employeeServiceImpli.fetchAllEmployeeByDesg(desg1, desg2, desg3);
		return list;
	}

}
