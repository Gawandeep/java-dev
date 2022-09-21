package com.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String args[])
    {      
        List<User> users = new ArrayList<User>();
        users.add(new User("John", "admin"));
        users.add(new User("Peter", "member"));
        List<User> admins = process(users, u -> u.getRole().equals("admin"));
        System.out.println(admins);
    }
  
    public static List<User> process(List<User> users, 
                            Predicate<User> predicate)
    {
        List<User> result = new ArrayList<User>();
        for (User user: users)        
            if (predicate.test(user))            
                result.add(user);
        return result;
    }
}
