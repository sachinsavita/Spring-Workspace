package com.spring.rest.webservices.rest_web_services.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeBeanController {
	
	@GetMapping("/filtering")
	public SomeBean filtering()
	
	{
		return new SomeBean("value1", "value2", "value3");
	}
	
	@GetMapping("/filteringlist")
	public List<SomeBean> filteringList()
	{
		return Arrays.asList(new SomeBean("value1", "value2", "value3"),
				new SomeBean("value4", "value5", "value6"));
	}
	
	
	//here value2 and value5 will not print bcs of @JsonIgnore on field2 in SomeBean Class

}
