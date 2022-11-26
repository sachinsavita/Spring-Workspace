package com.spring.rest.webservices.rest_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;



@Component
public class UserDAOService {
	
	//JPA, Hibernate => Database
	
	//Static data to talk 
	private static List<User> users = new ArrayList<>();
	private static int userCount = 0;
	
	static 
	{
		users.add(new User(++userCount, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(++userCount, "Zim", LocalDate.now().minusYears(40)));
		users.add(new User(++userCount, "Karly", LocalDate.now().minusYears(20)));
	}
	//findAll
	public List<User> findAll()
	{
		return users;
	}

	//findOne
	
	public User findUser(Integer id)
	{
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	
	
	//save
	public User saveUser(@RequestBody User user)
	{
		user.setId(++userCount);
		users.add(user);
		
		return user;
	}
	
	//delete
	public boolean deleteUserById(Integer id)
	{
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.removeIf(predicate);
	}
}
