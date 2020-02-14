package com.prueba.valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class PruebaValidApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaValidApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		template.execute("DROP TABLE PERSON IF EXISTS");
		template.execute("CREATE TABLE PERSON(id INTEGER(11) auto_increment PRIMARY KEY, name VARCHAR(255), lastName VARCHAR(255), processed BOOL)");
		
		for(int i = 0; i < 3; i++) {
			template.update("insert into person(name, lastName, processed)values('Person 000"+i+"', 'LastName 00"+i+"', 'FALSE')");
		}
	}

}
