package com.vm.java.interfacedemo;
public interface SwitchListener {
	
	void switchOne();
	void switchTwo();
	void switchThree();
	void switchFour();

	default void wifiSwitch() {
		System.out.println("dummy implementation");
	}


}