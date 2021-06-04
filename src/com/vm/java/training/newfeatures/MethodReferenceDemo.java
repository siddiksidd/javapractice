package com.vm.java.training.newfeatures;
interface Validate{
	void validateLogin();
}
class Car{
	void myLogin() {
		System.out.println("You Can Login Using id and Password");
	}
}
class Bus{
	static void login() {
		System.out.println("This is login");
	}
}
public class MethodReferenceDemo {
	public static void main(String[] args) {
		Validate v= ()-> System.out.println("Login Validation");
		v.validateLogin();
		
		Car c =new Car();
		Validate v1=c::myLogin;
		v1.validateLogin();
		
		Validate v2=Bus::login;
		v2.validateLogin();
	}
}
