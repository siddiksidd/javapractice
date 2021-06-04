package com.vm.training.java.Exceptions.BankAssignment;
public class MinimumBalanceException extends Exception{
	private static final long serialVersionUID = 1L;
	String message;
	MinimumBalanceException(String message)
	{
		this.message=message;
	}
	public String toString() {
		return message;
	}
}
