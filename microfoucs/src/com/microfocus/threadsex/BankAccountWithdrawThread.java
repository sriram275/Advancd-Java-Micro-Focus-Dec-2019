package com.microfocus.threadsex;

import com.microfocus.beans.BankAccount;

public class BankAccountWithdrawThread extends Thread {
	
	public BankAccountWithdrawThread(BankAccount bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}

	private BankAccount bankAccount;
	
	public void run () {
		System.out.println("BankAccountWithdrawThread started......");
		
		bankAccount.withdraw(500);
		
		System.out.println("BankAccountWithdrawThread ended......");
		
	}	

}
