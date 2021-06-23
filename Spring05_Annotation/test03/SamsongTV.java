package com.test03;

import org.springframework.stereotype.Component;

//SamsongTV samsong = new SamsongTV();  //따로 이름을 지정했으므로 지정된 이름으로 객체가 만들어진다
@Component("samsong")
public class SamsongTV implements TV {
	
	public SamsongTV() {
		System.out.println("samsong tv 생성");
	}

	@Override
	public void powerOn() {
		System.out.println("samsong tv power on");
	}

	@Override
	public void powerOff() {
		System.out.println("samsong tv power off");
	}

	@Override
	public void volumeUp() {
		System.out.println("samsong tv volume up");
	}

	@Override
	public void voluemDown() {
		System.out.println("samsong tv volume down");
	}

}
