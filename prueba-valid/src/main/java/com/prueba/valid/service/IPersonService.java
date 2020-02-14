package com.prueba.valid.service;

import java.util.List;

import com.prueba.valid.model.Person;

public interface IPersonService {
	
	public int createPerson(Person person);
	
	public int updatePerson(int id);
	
	public List<Person> list();

}
