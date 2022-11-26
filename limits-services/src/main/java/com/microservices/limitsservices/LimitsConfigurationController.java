package com.microservices.limitsservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsservices.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("limit")
	public LimitConfiguration retrieveLimitsFromConfiguration()
	{
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
	
}
