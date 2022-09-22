package com.blockingQueue;

import java.util.concurrent.BlockingQueue;

import com.functionalInterfaces.User;

public class Consumer implements Runnable {
	private BlockingQueue<User> blockingQueue;

	public Consumer(BlockingQueue<User> blockingQueue) {
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		

		try {
			Thread.sleep(2000);
			while (!Producer.stop) {
				Thread.sleep(1000);
				User user = blockingQueue.take();
				System.out.println(user.toString() + " consumed");
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
