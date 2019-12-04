package com.microfocus.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.microfocus.beans.Message;
import com.microfocus.threadsex.ConsumerThread;
import com.microfocus.threadsex.ProducerThread;

public class BlockingQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlockingQueue<Message> blockingQueue = new ArrayBlockingQueue<Message>(100);
		
		ProducerThread producer = new ProducerThread(blockingQueue);
		ConsumerThread consumer = new ConsumerThread(blockingQueue);
		
		producer.start();
		consumer.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
