package com.blockingQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.functionalInterfaces.User;
//Consumer Producer Problem
public class BlockingQueueMain {
	public static void main(String[] args) {
		BlockingQueue<User> blockingQueue=new ArrayBlockingQueue<>(1);
		List<User> users = new ArrayList<User>();
        users.add(new User("John", "admin"));
        users.add(new User("Peter", "member"));
        users.add(new User("Mike", "member"));
        users.add(new User("Steve", "member"));
        users.add(new User("Brandon", "admin"));
      
        
        new Thread(new Producer(users, blockingQueue)).start();
        new Thread(new Consumer(blockingQueue)).start();
	}

}
