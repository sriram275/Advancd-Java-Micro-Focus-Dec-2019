package com.microfocus.threadsex;

import java.util.concurrent.BlockingQueue;

import com.microfocus.beans.Message;

public class ProducerThread extends Thread {
	
	public ProducerThread(BlockingQueue<Message> blockingQueuue) {
		super();
		this.blockingQueuue = blockingQueuue;
	}

	private BlockingQueue<Message> blockingQueuue;
	
	
	public void run() {
		
		try {
			
			for (int i=0; i< 50;i++) {
				Message m1 = new Message(" Message:" + i);
				blockingQueuue.put(m1);
				
				Thread.sleep(1000);
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
