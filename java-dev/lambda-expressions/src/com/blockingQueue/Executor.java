package com.blockingQueue;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executor {

	public static void main(String[] args) throws InterruptedException {
		HashMap<String, Integer> hmap=new HashMap<>();
		hk(hmap);
  System.out.print(hmap.toString());
        
      

	}
	
	public static HashMap<String, Integer> hk(HashMap<String, Integer> hmap) throws InterruptedException{
		ExecutorService executor = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
		int i=0;
        for (int k=0; k < 10; k++) {  
        	final int temp=k;
            executor.execute(()->{
            	System.out.println("Agh");
            	hmap.put("A"+temp+Thread.currentThread().getName(), temp);
            }
            );//calling execute method of ExecutorService  
          }  
        executor.shutdown(); 
       
        executor.awaitTermination(1, TimeUnit.NANOSECONDS);
        
        System.out.println("Afff");
        return hmap;
	}

}

class WorkerThread implements Runnable {  
    private String message;  
    public WorkerThread(String s){  
        this.message=s;  
    }  
     public void run() {  
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  
        processmessage();//call processmessage method that sleeps the thread for 2 seconds  
        System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name  
    }  
    private void processmessage() {  
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }  
    }  
}  
