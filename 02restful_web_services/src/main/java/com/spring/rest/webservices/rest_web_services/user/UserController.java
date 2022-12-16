package com.spring.rest.webservices.rest_web_services.user;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import net.bytebuddy.asm.Advice.This;

@RestController
//@RequestMapping("/find")
public class UserController {
	
	@Autowired
	private UserDAOService userServices;
	
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		return userServices.findAll();
	}
	
	
	
	
	
	
	//http://localhost:9999/users
	//EntityModel
	//WebMvcLinkBuilder
	
	@GetMapping("/users/{id}")
	public EntityModel<User> findUser(@PathVariable Integer id)
	{
		User user = userServices.findUser(id);
		if(user==null)
		{
			throw new UserNotFoundException("id:"+id);
		}
		
		EntityModel<User> entityModel = EntityModel.of(user);
		
		WebMvcLinkBuilder link =  linkTo(methodOn(this.getClass()).getAllUsers());		
		
		entityModel.add(link.withRel("all-users"));
		
		return entityModel;
	}
	
	
	
	
	
	
	
	
	
	
	
//	@PostMapping("/users")
//	public ResponseEntity<User> saveUser(@RequestBody User user)
//	{
//		 userServices.saveUser(user);
//		 
//		 return ResponseEntity.created(null).build();
//	}
	
	//Want to return url of a created resource
//	after creating id 4 user return   -->>    /user/4  
	
	@PostMapping("/users")
	public ResponseEntity<User> saveUserAndReturnURL(@Valid @RequestBody User user)
	{
		User savedUser =  userServices.saveUser(user);
		//  /users/4  =>  users/{id} => user.getId
		 URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				 .path("/{id}")
				 .buildAndExpand(savedUser.getId())
				 .toUri();          
		return ResponseEntity.created(location ).build();
	}
	
	
	@DeleteMapping("/users/{id}")
	public boolean deleteUserById(@PathVariable Integer id)
	{
		User user = userServices.findUser(id);
		if(user==null)
		{
			throw new UserNotFoundException("id:"+id);
		}
		return userServices.deleteUserById(id);
	}

}