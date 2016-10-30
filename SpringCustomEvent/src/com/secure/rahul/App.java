package com.secure.rahul;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		CustomEventPublisher cep = (CustomEventPublisher)context.getBean("customEventPublisher");
		cep.publish();
		cep.publish();
	}
}
