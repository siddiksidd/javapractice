package com.vm.training.java.oops;

public class Car implements IVehicles {

	@Override
	public void Steerings() {
		System.out.println("Power steering");

	}

	@Override
	public void breaks() {
		System.out.println("Disc Breaks");

	}

	@Override
	public void accelator() {
		System.out.println("RPM");

	}

	@Override
	public void clutches() {
		System.out.println("Based on gears");

	}

	@Override
	public int gears() {
		// TODO Auto-generated method stub
		return 4;
	}
	public static void main(String[]args) {
		Car c=new Car();
		c.accelator();
		c.breaks();
		c.clutches();
		c.Steerings();
		c.gears();
	}

}
