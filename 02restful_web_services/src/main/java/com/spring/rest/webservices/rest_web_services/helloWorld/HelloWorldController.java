package com.spring.rest.webservices.rest_web_services.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//Rest API
@RestController
public class HelloWorldController {

	
	//    /helloworld
	
	// return Hellow World!
	
//	@GetMapping("/hello")
	@RequestMapping(method = RequestMethod.GET, path = "/hello")
	public String getHelloWorld()
	{
		return "Welcome to the World of Spring Restful WebServices!";
	}
	
	
	/*
	 * The @ResponseBody annotation tells a controller that the object returned is
	 * automatically serialized into JSON and passed back into the HttpResponse
	 * object.
	 */
	
	@GetMapping("/helloBean")
	@ResponseBody
	public HelloWorldBean helloWorldBean()
	{
		//HelloWorldBean obj = new HelloWorldBean();
		return new HelloWorldBean("Hello World Bean!");
		
		//return obj.getMessage();
	}
	
	
	//path parameter
	// users/{id}/todos/{id} => users/1/todos/101
	
	@GetMapping("/helloBean/path-variable/{name}")  //here name is path parameter
	public HelloWorldBean HelloWorldPathVariable(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Welcome to the coding world, %s ",name));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
