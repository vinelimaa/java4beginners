package com.in28minutes.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Up");
	}
	@Override
	public void down() {
		System.out.println("Down");
	}
	@Override
	public void left() {
		System.out.println("Left");
	}
	@Override
	public void right() {
		System.out.println("Right");
	}
}
