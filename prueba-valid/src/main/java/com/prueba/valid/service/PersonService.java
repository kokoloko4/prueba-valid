package com.prueba.valid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.valid.model.Person;
import com.prueba.valid.modelDAO.IPerson;

@Service
public class PersonService implements IPersonService{
	
	@Autowired
	private IPerson dao;

	@Override
	public int createPerson(Person person) {
		return dao.createPerson(person);
	}

	@Override
	public int updatePerson(int id) {
		return dao.updatePerson(id);
	}

	@Override
	public List<Person> list() {
		return dao.getPeople();
	}

}
