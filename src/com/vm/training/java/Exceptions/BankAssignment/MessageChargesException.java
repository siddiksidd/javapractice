package com.vm.training.java.Exceptions.BankAssignment;
public class MessageChargesException extends Exception{
	private static final long serialVersionUID = 1L;
	String message;
	MessageChargesException(String message)
	{
		this.message=message;
	}
	public String toString() {
		return message;
	}
}
