package com.example.demo.model;

import java.util.UUID;

public class Person {

	private final UUID id;

	private final String name;

	private final Integer age;

	public Person(UUID id, String name, Integer age) {
		this.id = id;
	    this.name = name;
	    this.age = age;
	  }

	public UUID getId() {
	    return id;
	}

	public String getName() {
	    return name;
	}

	public Integer getAge() {
		return age;
	}
}