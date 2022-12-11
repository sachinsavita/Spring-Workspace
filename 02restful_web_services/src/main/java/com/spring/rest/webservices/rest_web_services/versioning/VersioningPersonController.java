package com.spring.rest.webservices.rest_web_services.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
	
	@GetMapping("/v1/person")
	public PersonV1 getFirstVersionOfPersone()
	{
		return new PersonV1("John Garry");
	}
	
	@GetMapping("/v2/person")
	public static PersonV2 getSeconVersionOfPersone()
	{
		return new PersonV2(new Name("Bob","Marley"));
	}
	
	@GetMapping(path = "/person", params = "version=1")
	public static PersonV1 getFirstVersionOfPersoneRequestParam()
	{
		return new PersonV1("John Garry");
	}
	
	@GetMapping(path = "/person/param", params = "version=2")
	public static PersonV2 getSecondVersionOfPersoneRequestParam()
	{
		return new PersonV2(new Name("Bob","Marley"));
	}
	
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=1")
	public static PersonV1 getFirstVersionOfPersoneRequestHeader()
	{
		return new PersonV1("Marry Christen");
	}
	
	@GetMapping(path = "/person/header", headers = "X-API-VERSION=2")
	public static PersonV2 getSecondVersionOfPersoneRequestHeader()
	{
		return new PersonV2(new Name("Bob","Marley"));
	}
	
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
	public static PersonV1 getFirstVersionOfPersoneRequestAcceptHeader()
	{
		return new PersonV1("Bob Christen");
	}
	
	@GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
	public static PersonV2 getSecondVersionOfPersoneRequestAcceptHeader()
	{
		return new PersonV2(new Name("Bob","Marley"));
	}
	
	
	

}
