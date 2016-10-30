package com.secure.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloIndia helloIndia = (HelloIndia) context.getBean("helloIndia");
		helloIndia.getMessage1();
		helloIndia.getMessage2();
		helloIndia.setMessage3("Override");
		helloIndia.getMessage3();

	}
}
