package com.nit.sj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sj.service.IPerchaseOrder;

@SpringBootApplication
public class SbProj10SendMailApplication {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ctx = SpringApplication.run(SbProj10SendMailApplication.class, args);) {
			IPerchaseOrder order = ctx.getBean("purchaseService",IPerchaseOrder.class);
			String msg = order.purchse(new String [] {"shart","pant","banel"}, new double [] {500,600,100}, new String[] {"shamjohari0@gmail.com"});
			System.out.println(msg);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
