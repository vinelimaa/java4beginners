package com.in28minutes.learn_spring_framework.game.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {

	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All dependencies are ready!");
	}

	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}

	@PreDestroy
	public void cleanup() {
		System.out.println("Clean Up");
	}
}

@Component
class SomeDependency {

	public void getReady() {
		System.out.println("Som logic using SomeDependency");

	}

}

@Configuration
@ComponentScan("com.in28minutes.learn_spring_framework.game.examples.f1")
public class PrePosAnnotationsContextLauncherApplication {


	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(PrePosAnnotationsContextLauncherApplication.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}

}
