package com.vm.java.training.concurrency;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	BlockingQueue<Integer> commonQueue;
	
	public Producer(BlockingQueue<Integer> commonQueue) {
		super();
		this.commonQueue = commonQueue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println("Producer");
			commonQueue.add(i);
			System.out.println("elements add is "+i);
			System.out.println("queue elements are "+ commonQueue);
			System.out.println("=====================");
		}
	}

}
