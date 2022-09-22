package com.countdownLatch;

import java.util.concurrent.CountDownLatch;

public class DevTeam implements Runnable {
	private CountDownLatch countDownLatch;
	
	public DevTeam(CountDownLatch countDownLatch) {
		this.countDownLatch=countDownLatch;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" has assigned a task");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" has completed a task");
		//Decrement the Latch count by 1
		countDownLatch.countDown();
	}

	
}
