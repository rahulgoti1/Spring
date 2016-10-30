package com.secure.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

		helloWorld.setMessage("Rahul A Goti");
		helloWorld.getMessage();

		HelloWorld helloWorldB = (HelloWorld) context.getBean("helloWorld");
//		helloWorldB.setMessage("Java World");
		helloWorldB.getMessage();
	}

}
