package com.test04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test04/beans.xml");
		
		Developer lee = factory.getBean("lee-ss", Developer.class);
		//"lee-ss"(오브젝트)는 Developer.class(developer의 class타입)타입입니다 해주면 자동적으로 형변환 해서 나온다
		
		Engineer hong = (Engineer) factory.getBean("hong-gd");
		
		System.out.println(lee);
		System.out.println(hong);
	}

}
