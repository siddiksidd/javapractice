package com.vm.java.tasks;

public class Car {
	int yearModel;
	String make;
	int speed=0;
	

	public Car(int yearModel, String make) {
		super();
		this.yearModel = yearModel;
		this.make = make;
	}


	public int getYearModel() {
		return yearModel;
	}


	public String getMake() {
		return make;
	}


	public int getSpeed() {
		return speed;
	}
	
	int accelarate() {
		return speed+=5;
	}
	int brake() {
		return speed-=5;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car(1995,"Bat Mobile");
		/*for(int i=1;i<=5;i++) {
			c.accelarate();
			System.out.println("Current speed is "+c.getSpeed());
		}
		for(int j=1;j<=5;j++) {
			c.brake();
			System.out.println("Current speed is "+c.getSpeed());
			*/
		System.out.println(c.accelarate());
		System.out.println(c.accelarate());
		System.out.println(c.accelarate());
		System.out.println(c.accelarate());
		System.out.println(c.accelarate());
		System.out.println(c.brake());
		System.out.println(c.brake());
		System.out.println(c.brake());
		System.out.println(c.brake());
		System.out.println(c.brake());
		}
	}


