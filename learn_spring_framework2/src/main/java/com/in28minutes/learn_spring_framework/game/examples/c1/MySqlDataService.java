package com.in28minutes.learn_spring_framework.game.examples.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public class MySqlDataService {

	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] { 11, 22, 33, 44, 55 };
	}

}
