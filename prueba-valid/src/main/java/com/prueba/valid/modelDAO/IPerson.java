package com.prueba.valid.modelDAO;

import java.util.List;

import com.prueba.valid.model.Person;

public interface IPerson {

	public int createPerson(Person person);
	
	public int updatePerson(int id);
	
	public List<Person> getPeople();
	
}
