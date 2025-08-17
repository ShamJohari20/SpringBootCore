package com.nit.sj.dao;

import java.util.List;

import com.nit.sj.model.Employee;

public interface IEmpolyeeDAO {
	
	public int insertEmployee(Employee emp) throws Exception;
	public List<Employee> showEmployeesByDesgs (String desg1,String desg2,String desg3) throws Exception;
}