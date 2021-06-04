package com.vm.java.training.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Integer> bq=new LinkedBlockingQueue<Integer>();
		Producer producer=new Producer(bq);
		Consumer consumer=new Consumer(bq);
		
		Thread producerthread=new Thread(producer);
		Thread consumerthread=new Thread(consumer);
		
		producerthread.start();
		consumerthread.start();
	}

}
