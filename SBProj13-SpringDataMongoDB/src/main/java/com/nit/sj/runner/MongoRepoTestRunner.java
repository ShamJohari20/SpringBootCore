package com.nit.sj.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.sj.document.Employee;
import com.nit.sj.service.IEmployeeMngService;

@Component("runner")
public class MongoRepoTestRunner implements CommandLineRunner {
	
	@Autowired
	private IEmployeeMngService service;
	
	@Override
	public void run(String... args) throws Exception {
		Employee e = new Employee(101,"Sham",930000.0);
		System.out.println(service.saveEmployee(e));
	}

}
