package com.secure.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Student student = (Student) context.getBean("student");
		student.getAge();
		student.getName();
		student.printThrowException();

	}
}
