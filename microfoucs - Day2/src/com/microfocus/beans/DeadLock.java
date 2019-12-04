package com.microfocus.beans;

public class DeadLock {
	
	private String str1 = new String ("str1"); 
	
	private String str2 = new String ("str2");
	
	
	public void thread1Logic () {
		
		System.out.println("Thread1 logic started....");
		
		synchronized(str1) { //obtains the lock on str1
			//doing the business logic
			System.out.println("str1 locked....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("trying to obtain the lock on str2....");
			synchronized(str2) { //trying to obtain the lock on str2, which was already
				//obtained by Thread2				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		System.out.println("Thread1 logic ended....");
		
	}
	
public void thread2Logic () {
		
		System.out.println("Thread2 logic started....");
		
		synchronized(str2) { //obtains the lock on str2
			//doing the business logic
			System.out.println("str2 locked....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("trying to obtain the lock on str1....");
			synchronized(str1) { //trying to obtain the lock on str1, which was already
				//obtained by Thread1				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
		}
		
		System.out.println("Thread2 logic ended....");
		
	}


}
