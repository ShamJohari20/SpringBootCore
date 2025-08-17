package com.nit.sj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sj.document.Employee;
import com.nit.sj.service.IEmployeeMngService;

@SpringBootApplication
public class SbProj13SpringDataMongoDbApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(SbProj13SpringDataMongoDbApplication.class, args);){
			IEmployeeMngService service = ctx.getBean("empMngService",IEmployeeMngService.class);
			
			Employee e = new Employee(101,"Sham",930000.0);
			
			System.out.println(service.saveEmployee(e));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
