package com.microfocus.threadsex;

import com.microfocus.beans.BankAccount;

public class BankAccountDepositThread extends Thread {
	
	public BankAccountDepositThread(BankAccount bankAccount) {
		super();
		this.bankAccount = bankAccount;
	}

	private BankAccount bankAccount;
	
	public void run () {
		System.out.println("BankAccountDepositThread started......");
		
		bankAccount.deposit(1000);
		
		System.out.println("BankAccountDepositThread ended......");
		
	}	

}
