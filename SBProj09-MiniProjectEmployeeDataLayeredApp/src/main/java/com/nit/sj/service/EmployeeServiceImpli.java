package com.nit.sj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.sj.dao.EmployeeDAOImpl;
import com.nit.sj.model.Employee;

@Service("eservice")
public class EmployeeServiceImpli implements IEmployeeService {
	
	@Autowired
	EmployeeDAOImpl employeeDAOImpl;

	public EmployeeServiceImpli() {
		System.out.println("EmployeeServiceImpli.EmployeeServiceImpli()");
	}
	
	
	@Override
	public String  registerEmployee(Employee emp) throws Exception{
		
		int result = employeeDAOImpl.insertEmployee(emp);
		
		return result==0?"Employee Not Register ":"Employee Is Register";
		
	}


	@Override
	public List<Employee> fetchAllEmployeeByDesg(String desg1, String desg2, String desg3) throws Exception {
		System.out.println("EmployeeServiceImpli.fetchAllEmployeeByDesg()");
		//Convert Designation into Upper Case 
		desg1 = desg1.toUpperCase();
		desg2 = desg2.toUpperCase();
		desg3 = desg3.toUpperCase();
		
		// Calculate Gross and Net Salary
		List<Employee>list = employeeDAOImpl.showEmployeesByDesgs(desg1, desg2, desg3);
		
		list.forEach(emp->{
			emp.setGrossSalary(emp.getSalary()+emp.getSalary()*0.2);
			emp.setNetSalary(emp.getGrossSalary()-emp.getGrossSalary()*0.1);
		});
		
		
		return list;
	}

}
