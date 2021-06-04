package com.vm.training.java.Exceptions.BankAssignment;
import java.util.ArrayList;
public class AccountDetails {
	public ArrayList<Account> store()
	{
		Account[] acc = new Account[3];
		for(int i=0;i<3;i++)
		{
			acc[i]=new Account();
		}
		ArrayList<Account> bankaccounts = new ArrayList<Account>();
		acc[0].setAccno("127439474320348");
		acc[0].setIfsc("HDFC03272");
		acc[0].setAcctype("Savings");
		acc[0].setBranch("telangana");
		acc[0].setName("rahul");
		acc[0].setMobile("0123456789");
		acc[0].setBalance(5000);
		acc[0].setStatus("online");
		acc[0].setUserid("vm9897");
		acc[0].setPassword("123456");
		acc[1].setAccno("126392843085343");
		acc[1].setIfsc("HDFC76438");
		acc[1].setAcctype("Current");
		acc[1].setBranch("Delhi");
		acc[1].setName("siddik");
		acc[1].setMobile("1234567890");
		acc[1].setBalance(9500);
		acc[1].setStatus("online");
		acc[1].setUserid("vm136");
		acc[1].setPassword("123456");
		acc[2].setAccno("122458930923298");
		acc[2].setIfsc("HDFC04765");
		acc[2].setAcctype("Salary");
		acc[2].setBranch("andhra");
		acc[2].setName("akshay");
		acc[2].setMobile("9102938475");
		acc[2].setBalance(100);
		acc[2].setUserid("vm14");
		acc[2].setPassword("123456");
		acc[2].setStatus("onhold");
		for(int i=0;i<3;i++)
		{
			bankaccounts.add(acc[i]);
		}
		return bankaccounts;
	}
}
