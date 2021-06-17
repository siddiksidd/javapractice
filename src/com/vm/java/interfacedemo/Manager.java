package com.vm.java.interfacedemo;
public class Manager {
	public static void main(String[] args) {
		//HavellsAppliances havellsAppliances = new HavellsAppliances();
		SwitchListener switchListener = new GEAppliances();
				//new HavellsAppliances();
		//SwitchListener switchlistener = new SwitchListener();
		switchListener.switchOne();
		switchListener.switchTwo();
		switchListener.switchThree();
		switchListener.switchFour();
		switchListener.wifiSwitch();

	}
}