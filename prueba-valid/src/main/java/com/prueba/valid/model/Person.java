package com.prueba.valid.model;

public class Person {
	
	private int id;
	private String name;
	private String lastName;
	private Boolean processed;
	
	public Person() {
		super();
	}

	public Person(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.processed = false;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Boolean getProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}
	
	
}
