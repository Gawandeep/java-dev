package com.cyclicBarriers;

import java.util.concurrent.CyclicBarrier;

// Cab only runs when 4 persons arrived
public class CyclicBarrierMain {

	public static void main(String[] args) {
		//4 Parties per cab
		CyclicBarrier cyclicBarrier=new CyclicBarrier(4);
		
		new Thread(new Cab(1000, cyclicBarrier),"Mike").start();
		new Thread(new Cab(2000, cyclicBarrier),"Tom").start();
		new Thread(new Cab(1500, cyclicBarrier),"Harry").start();
		new Thread(new Cab(1200, cyclicBarrier),"John").start();
		new Thread(new Cab(3000, cyclicBarrier),"Aman").start();
		new Thread(new Cab(2300, cyclicBarrier),"Kamal").start();
		new Thread(new Cab(2000, cyclicBarrier),"Lily").start();
		new Thread(new Cab(1800, cyclicBarrier),"Rita").start();
		
	}

}
