package com.secure.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Circle triangle = (Circle) context.getBean("circle");
		triangle.draw();
	}
}
