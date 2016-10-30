package com.secure.rahul;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHello implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("BeforeInitialization : " + arg1);
		return arg0; // you can return any other object as well
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("AfterInitialization : " + arg1);
		return arg0; // you can return any other object as well
	}

}
