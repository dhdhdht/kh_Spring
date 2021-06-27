package com.test04;

public class Woman implements Student {

	@Override
	public String classWork() {
		System.out.println("컴퓨터 켜서 주식본다");
		return "스프링연습";
	}

}
