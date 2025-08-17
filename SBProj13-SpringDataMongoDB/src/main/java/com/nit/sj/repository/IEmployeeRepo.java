package com.nit.sj.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nit.sj.document.Employee;

public interface IEmployeeRepo extends MongoRepository<Employee, String >{
	
	
}
