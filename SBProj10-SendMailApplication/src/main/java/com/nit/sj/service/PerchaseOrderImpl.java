package com.nit.sj.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service("purchaseService")
public class PerchaseOrderImpl implements IPerchaseOrder{

	@Autowired
	private JavaMailSender sender ;
	@Value("${spring.mail.username}")
	private String fromMail;

   
	
	@Override
	public String purchse(String[] items, double[] price, String[] toEmails) throws Exception {
		double billAmount = 0.0;
		
		for (double p:price) {
			billAmount=billAmount+p;
		}
		String msg = Arrays.toString(items)+" with price "+Arrays.toString(price)+" are perches with bill amount "+billAmount;
		String status = sendMail (msg,toEmails);
		return msg + " ---> " +status;
	}
	
	private String sendMail(String msg, String [] toEmails) throws Exception{
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,true);
		
		helper.setFrom(fromMail);
		helper.setCc(toEmails);
		helper.setSubject("open it to know it");
		helper.setSentDate(new Date());
		helper.setText(msg);
		helper.addAttachment("hanumanji.jpeg", new ClassPathResource("hanumanji.jpeg"));
		sender.send(message);
		return "Mail Send";
		
	}
}
