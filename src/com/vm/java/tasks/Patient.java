package com.vm.java.tasks;

public class Patient {
	private int patientId;
	private String name;
	private int age;
	public Patient(int patientId, String name, int age) {
		super();
		this.setPatientId(patientId);
		this.setName(name);
		this.setAge(age);
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
