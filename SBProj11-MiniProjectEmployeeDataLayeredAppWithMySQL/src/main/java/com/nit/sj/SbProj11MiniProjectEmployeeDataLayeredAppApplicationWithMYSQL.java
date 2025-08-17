package com.nit.sj;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nit.sj.controller.PayrollOperationsController;
import com.nit.sj.model.Employee;

@SpringBootApplication
@ImportResource("com/nit/sj/sfg/ApplicationContext.xml")

public class SbProj11MiniProjectEmployeeDataLayeredAppApplicationWithMYSQL {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication
				.run(SbProj11MiniProjectEmployeeDataLayeredAppApplicationWithMYSQL.class, args);
				
				Scanner sc = new Scanner(System.in);
				){
			System.out.println("SbProj09MiniProjectEmployeeDataLayeredAppApplication.main()");
			
			PayrollOperationsController controller = ctx.getBean("econtroller",PayrollOperationsController.class);
			//======================================================================================================
			
			System.out.println("Enter The EMployee Name");
			String ename = sc.next();
			
			System.out.println("Enter The JOB Name");
			String ejob = sc.next();
			
			System.out.println("Enter The SAL Name");
			Double esal = sc.nextDouble();
			
			
			Employee emp = new Employee(ename, ejob, esal);
			
			try {
				
				String result = controller.processEmployee(emp);
				System.out.println(result);
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			//==========================================================================================================
			System.out.println("Enter the first Desiganation");
			String desg1 = sc.next();
			System.out.println("Enter the Second Desiganation");
			String desg2 = sc.next();
			System.out.println("Enter the third Desiganation");
			String desg3 = sc.next();
			
			List<Employee>list=controller.showAllEMployeeByDesg(desg1, desg2, desg3);
			list.forEach(System.out::println);

			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
