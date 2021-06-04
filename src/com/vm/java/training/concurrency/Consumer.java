package com.vm.java.training.concurrency;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	BlockingQueue<Integer> commonQueue;
	public Consumer(BlockingQueue<Integer> commonQueue) {
		super();
		this.commonQueue = commonQueue;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				System.out.println("Consumer:");
				System.out.println("consumer is taking "+commonQueue.take());
				System.out.println("==================");
			}
			catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
