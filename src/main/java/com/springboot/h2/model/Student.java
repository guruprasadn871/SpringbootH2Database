package com.springboot.h2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// @Entity annotation specifies that the class is mapped to a database table.
@Entity
public class Student {

	// @Id annotation specifies the primary key of an entity.
	@Id
	private Integer id;
	private String name;
	private Integer age;
	private String emailAddress;

	// Default constructor.
	public Student() {	}

	// Parameterized constructor.
	public Student(Integer id, String name, Integer age, String emailAddress) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.emailAddress = emailAddress;
	}

	// Getters.
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
}
