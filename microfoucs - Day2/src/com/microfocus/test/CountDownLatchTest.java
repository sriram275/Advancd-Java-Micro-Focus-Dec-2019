package com.microfocus.test;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDownLatch countDownLatch = new CountDownLatch(3); 
		WaitingThread waitingThread = new WaitingThread(countDownLatch);
		CountDownThread countDownThread = new CountDownThread(countDownLatch);		
		waitingThread.start();
		countDownThread.start();
	}
}
class WaitingThread extends Thread {
	public WaitingThread(CountDownLatch countDownLatch) {
		super();
		this.countDownLatch = countDownLatch;
	}
	private CountDownLatch countDownLatch;
	public void run () {
		try {
			System.out.println("I am waiting............");
			countDownLatch.await();
			System.out.println("after all count downs...............");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class CountDownThread extends Thread {
	public CountDownThread(CountDownLatch countDownLatch) {
		super();
		this.countDownLatch = countDownLatch;
	}
	private CountDownLatch countDownLatch;
	public void run () {
		try {
			Thread.sleep(1000);
			System.out.println("count down:" +1);
			countDownLatch.countDown();
			Thread.sleep(1000);
			System.out.println("count down:" +2);
			countDownLatch.countDown();
			Thread.sleep(1000);
			System.out.println("count down:" +3);
			countDownLatch.countDown();		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

