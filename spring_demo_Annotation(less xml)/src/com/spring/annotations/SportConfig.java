package com.spring.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.annotations")
//Now no need to mention  <context:component-scan base-package="com.spring.annotations"></context:component-scan> in applicationContext.xml file
public class SportConfig {
	
	

}
