package com.test01;

import org.springframework.stereotype.Component;

@Component
public interface Human {

	String sayName(String name);
	String sayJob(String job);
}
