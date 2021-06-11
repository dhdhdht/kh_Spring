package com.test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/test01/applicationContext.xml");
		
		MessageBean kiwi = (MessageBean) factory.getBean("kiwi");
		MessageBean banana = (MessageBean) factory.getBean("banana");
		MessageBean melon = (MessageBean) factory.getBean("melon");
		MessageBean cherry = (MessageBean) factory.getBean("cherry");
		
		kiwi.sayHello();
		banana.sayHello();
		melon.sayHello();
		cherry.sayHello();
	}

}
