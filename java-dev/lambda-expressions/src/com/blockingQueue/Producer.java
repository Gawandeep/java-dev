package com.blockingQueue;

import java.util.List;
import java.util.concurrent.BlockingQueue;

import com.functionalInterfaces.User;

public class Producer implements Runnable {
	private BlockingQueue<User> blockingQueue;
	private List<User> users;
	//tells the consumer when to stop
	public static volatile boolean stop=false;
	public Producer(List<User> users, BlockingQueue<User> blockingQueue) {
		this.users = users;
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {

		users.forEach(u -> {
			try {
				Thread.sleep(1000);
				blockingQueue.put(u);
				System.out.println(u.toString() + " produced  Remaining capacity "+ blockingQueue.remainingCapacity());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		stop=true;
	}


}
