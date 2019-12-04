package com.microfocus.test;

import com.microfocus.beans.BankAccount;
import com.microfocus.threadsex.BankAccountDepositThread;
import com.microfocus.threadsex.BankAccountWithdrawThread;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main method started");
		BankAccount bankAccount = new BankAccount(10);
				
		BankAccountWithdrawThread bankAccountWithdrawThread = new BankAccountWithdrawThread(bankAccount);
		BankAccountDepositThread bankAccountDepositThread = new BankAccountDepositThread(bankAccount);
		
		
		bankAccountWithdrawThread.start();
		bankAccountDepositThread.start();
		
		
		System.out.println("Main method ended");
		

	}

}
