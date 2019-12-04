package com.microfocus.beans;

public class BankAccount {

	public BankAccount(int amount) {
		super();
		this.amount = amount;
	}

	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	Object str = new String("Hi");
	
	public synchronized void deposit(int depositAmount) {
		
			System.out.println("Deposit method started");
			System.out.println("Depositing amount:" + depositAmount);
			
			
			
			this.amount = this.amount + depositAmount;
			
			System.out.println("calling the waiting thread back to perform the operation...");			
			
			try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notify();
			
			System.out.println("Deposit method completed. FInal amount." + this.amount);		
		
	} 
	
	public synchronized void withdraw(int withdrawAmount) {
		
			System.out.println("withdraw method started");
			System.out.println("withdrawing amount:" + withdrawAmount);
						
			if (this.amount < withdrawAmount) {
				try {
					System.out.println("in waiting state....");
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("after notify.......");
			}
			
			this.amount = this.amount - withdrawAmount;
			System.out.println("Withdraw method completed. Final amount." + this.amount);
		
	} 
	
	
	
	
}
