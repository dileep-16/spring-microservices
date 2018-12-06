package com.springbootrestful.com.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> users=new ArrayList<>();
	private static int usersCount=5;
	static
	 {
       users.add(new User(101,"dileep",new Date()));
       users.add(new User(102,"rohit",new Date()));
       users.add(new User(103,"amit",new Date()));
       users.add(new User(104,"rajiv",new Date()));
       users.add(new User(105,"puja",new Date()));
	 }
	
	
	public User save(User user)
	{   if(user.getId()==null) {
		user.setId(++usersCount);
	}
	   users.add(user);
		return user;
		
	}
	
	public User findOne(int id)
	{
		for(User user:users)
		{
			if(user.getId()==id)
			{
				return user;
			}
		}
		return null;
		
	}
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return users;
	}
	
	public User deleteById(int id)
	{ Iterator <User> itr=users.iterator();
	   while(itr.hasNext())
	   {
		   User user=itr.next();
		   if(user.getId()==id)
		   {
			   itr.remove();
			   return user;
		   }
		   
	}
	
	
		return null;
		
	}
	
	

}
