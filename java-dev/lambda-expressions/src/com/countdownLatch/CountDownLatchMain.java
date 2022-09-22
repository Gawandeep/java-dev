package com.countdownLatch;

import java.util.concurrent.CountDownLatch;

// Program to wait QA Team Threads until the Dev Team Threads completed all his work using CountDownLatch
public class CountDownLatchMain {

	public static void main(String[] args) throws InterruptedException {
		//initializing CountDownLatch with 2 latches, one for each Dev Team. 
		CountDownLatch countDownLatch = new CountDownLatch(2);
		
		new Thread(new DevTeam(countDownLatch), "Dev Team A").start();
		new Thread(new DevTeam(countDownLatch), "Dev Team B").start();

		// Wait until the latch count to zero which means Each Dev Team Completed all the work
		countDownLatch.await();

		//QA Team
		new Thread(() -> {
			System.out.println(Thread.currentThread().getName() + " has started the work");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(Thread.currentThread().getName() + " has completed the work");
		}, "QA Team").start();
	}

}
