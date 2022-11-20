package com.spring.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//This class is added to scan components using @ComponentScan means whatever beans available it will track no xml file required

@Configuration
@ComponentScan("com.spring.annotations")
//Now no need to mention  <context:component-scan base-package="com.spring.annotations"></context:component-scan> in applicationContext.xml file
public class SportConfig {
	
	

}
