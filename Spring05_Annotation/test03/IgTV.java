package com.test03;

import org.springframework.stereotype.Component;

//IgTV igTV = new IgTV(); //컴포넌트만 지정하면 클래스이름에서 앞글자 소문자로 객체생성
@Component
public class IgTV implements TV {
	
	public IgTV() {
		System.out.println("ig tv 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("ig tv power on");
	}

	@Override
	public void powerOff() {
		System.out.println("ig tv power off");
	}

	@Override
	public void volumeUp() {
		System.out.println("ig tv volume up");
	}

	@Override
	public void voluemDown() {
		System.out.println("ig tv volume down");
	}

}
