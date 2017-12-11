package com.bjethwan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bjethwan.service.ICustomerService;



public class Application {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		ICustomerService customerService = context.getBean("customerService", ICustomerService.class);
		
		System.out.println(customerService.findAll().get(0).getFirstName());
		
	}
}
