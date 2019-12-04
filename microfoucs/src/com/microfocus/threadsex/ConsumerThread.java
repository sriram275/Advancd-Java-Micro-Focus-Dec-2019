package com.microfocus.threadsex;

import java.util.concurrent.BlockingQueue;

import com.microfocus.beans.Message;

public class ConsumerThread extends Thread{

	public ConsumerThread(BlockingQueue<Message> blockingQueuue) {
		super();
		this.blockingQueuue = blockingQueuue;
	}

	private BlockingQueue<Message> blockingQueuue;
	
	
	public void run() {
	
		try {
			for (int i=0; i< 50;i++) {
				Message m1 = blockingQueuue.take();
				System.out.println("retrieved from blocking queue:" + m1.getMessage());
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
