package com.prueba.valid.modelDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.prueba.valid.model.Person;

@Repository
public class PersonDAO implements IPerson {
	
	@Autowired
	private JdbcTemplate template;	

	@Override
	public int createPerson(Person person) {
		String sql = "insert into person(name, lastName, processed)values('"+person.getName()+"','"+person.getLastName()+"','FALSE')";
		return template.update(sql);
	}

	@Override
	public int updatePerson(int id) {
		String updatePerson = "update person set processed='TRUE' where id="+id;
		return template.update(updatePerson);
	}

	@Override
	public List<Person> getPeople() {
		String sql = "select * from person";
		List<Person> persons = template.query(sql, new BeanPropertyRowMapper<Person>(Person.class));
		return persons;
	}

	
}
