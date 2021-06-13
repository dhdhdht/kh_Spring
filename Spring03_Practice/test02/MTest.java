package com.test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test02/applicationContext.xml");
		Emp lee = (Emp) factory.getBean("lee");
		Emp kim = factory.getBean("kim", Emp.class);
		
		System.out.println(lee);
		System.out.println(kim);
	}

}
