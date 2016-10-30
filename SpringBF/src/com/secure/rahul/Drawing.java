package com.secure.rahul;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation")
public class Drawing {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		Triangle triangle = (Triangle) factory.getBean("triangle");
		triangle.draw();
	}

}
