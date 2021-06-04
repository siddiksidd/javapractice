package com.vm.training.java.Exceptions.BankAssignment;
public interface Bank {
	public String Withdrawl(double amount,Account a) throws Exception;
	public String Deposit(double amount,Account a)throws Exception;
	public void CheckBalance(Account a)throws Exception;
}
