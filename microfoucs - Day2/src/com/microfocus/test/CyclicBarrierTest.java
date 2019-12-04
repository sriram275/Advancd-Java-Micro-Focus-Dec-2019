package com.microfocus.test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable runnable = new Runnable () {
			public void run () {
				System.out.println("Barrier 1 related business logic will be executed "
						+ "after all threads reaches barrer1");
			}
		};
		
		Runnable runnable1 = new Runnable () {
			public void run () {
				System.out.println("Barrier 2 related business logic will be executed after"
						+ "all threads reaches to barrier2");
			}
		};
		
		CyclicBarrier barrier1 = new CyclicBarrier(2, runnable);
		CyclicBarrier barrier2 = new CyclicBarrier(2, runnable1);		
		CyclicBarrierThread thread1 = new CyclicBarrierThread(barrier1,barrier2);
		CyclicBarrierThread thread2 = new CyclicBarrierThread(barrier1,barrier2);
		thread1.start();
		thread2.start();
	}	
}
class CyclicBarrierThread extends Thread {
	public CyclicBarrierThread(CyclicBarrier barrier1, CyclicBarrier barrier2) {
		this.barrier1 = barrier1;
		this.barrier2 = barrier2;
	}
	private CyclicBarrier barrier1;
	private CyclicBarrier barrier2;	
	public void run () {
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " waiting at barrier1");
			barrier1.await();					
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " waiting at barrier2");
			barrier2.await();			
			System.out.println("CyclicBarrierThread completes for " + Thread.currentThread().getName());
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}












