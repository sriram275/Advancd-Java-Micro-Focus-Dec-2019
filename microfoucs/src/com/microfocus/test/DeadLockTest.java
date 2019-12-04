package com.microfocus.test;

import com.microfocus.beans.DeadLock;

public class DeadLockTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLock deadLock = new DeadLock();
		FirstThread firstThread = new FirstThread(deadLock);
		SecondThread secondThread = new SecondThread(deadLock);
		firstThread.start();
		secondThread.start();
	}
}
class FirstThread extends Thread {	
	public FirstThread(DeadLock deadLock) {
		super();
		this.deadLock = deadLock;
	}
	private DeadLock deadLock;	
	public void run () {
		deadLock.thread1Logic();
	}
}
class SecondThread extends Thread {	
	public SecondThread(DeadLock deadLock) {
		super();
		this.deadLock = deadLock;
	}
	private DeadLock deadLock;	
	public void run () {
		deadLock.thread2Logic();
	}
}