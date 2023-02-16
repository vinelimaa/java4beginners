package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {
	
}
record Address(String firstLine, String city) {
	
}

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "vini";
	}
	
	@Bean
	public int age() {
		return 26;
	}
	
	@Bean
	public Person person() {
		return new Person("Kelly", 25, new Address(" line2", "Teste"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	
	@Bean
	public String firstLine() {
		return "line1";
	}
	
	@Bean
	public String city() {
		return "Gothan City";
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("line2", "Teste2");
	}
	
	@Bean(name = "address3")
	public Address address3() {
		return new Address("line3", "Teste3");
	}
}
