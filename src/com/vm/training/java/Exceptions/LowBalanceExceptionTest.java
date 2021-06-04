package com.vm.training.java.Exceptions;

public class LowBalanceExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance=900;
		try {
		if(balance<1000) {
		throw new LowBalanceException("Your Balance is less than 1000/-");
		}
		}
		catch(LowBalanceException e) {
			e.printStackTrace();
		}
	}

}
