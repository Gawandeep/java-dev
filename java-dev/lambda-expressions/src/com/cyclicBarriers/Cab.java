package com.cyclicBarriers;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Cab implements Runnable{
	
	CyclicBarrier cyclicBarrier;
	int duration;
	
	public Cab(int duration, CyclicBarrier cyclicBarrier) {
		this.duration=duration;
		this.cyclicBarrier=cyclicBarrier;
	}

	@Override
	public void run() {
		
		try {
			//arriving time for each passenger
			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName()+" has arrived at cab location");
			
			//decrement party count 
			int i=cyclicBarrier.await();
			
			if(i==0) {
				System.out.println("4 persons arrived, Cab Started");
			}
		} catch (InterruptedException|BrokenBarrierException e) {
			e.printStackTrace();
		}
		
		
	}

}
