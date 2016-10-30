package com.secure.rahul;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ClassPathXmlApplicationContext is load all beans in the application
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		// this step is used to get required bean using getBean() method of the
		// created context
		HelloWorld hw = (HelloWorld) context.getBean("helloWorld");
		hw.getMessage();

	}

}
