package org.springframework.factoryBean;

import jdk.nashorn.internal.objects.annotations.Getter;

public class User {

	private String name;


	User(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				'}';
	}
}
