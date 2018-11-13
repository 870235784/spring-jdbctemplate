package com.tca.launch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("classpath:spring-config/spring-config.xml");
		ac.start();
	}
}
