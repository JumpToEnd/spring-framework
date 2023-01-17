package org.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hi Spring!");

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryBean.xml");
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

		

	}
}