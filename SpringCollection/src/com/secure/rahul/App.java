package com.secure.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");

		Customer customer = (Customer) applicationContext.getBean("CustomerBean");
		System.out.println(customer);
	}

}
