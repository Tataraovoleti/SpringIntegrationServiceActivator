package com.tata.springintegration.serviceact;

import org.springframework.integration.annotation.ServiceActivator;

public class HelloWorldService {

	@ServiceActivator
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
