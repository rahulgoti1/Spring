package com.secure.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Hello hello = (Hello) context.getBean("hello");
		hello.getMessage();
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
