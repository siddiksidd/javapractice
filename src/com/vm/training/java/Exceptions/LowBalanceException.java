package com.vm.training.java.Exceptions;

public class LowBalanceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message="message";
	LowBalanceException(String message){
		this.message=message;
	}
	public String toString() {
		return message;
	}
}
