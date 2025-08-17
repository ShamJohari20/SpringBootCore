package com.nit.sj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.sj.document.Employee;
import com.nit.sj.repository.IEmployeeRepo;

@Service("empMngService")
public class EmployeeMngServiceImpl implements IEmployeeMngService {
	
	@Autowired
	IEmployeeRepo empRepo;

	@Override
	public String saveEmployee(Employee e) {
			
		return "MongoDB Doc is Saved with id Value : " + empRepo.insert(e).getId();
	}

}
