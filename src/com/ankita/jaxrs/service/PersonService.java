package com.ankita.jaxrs.service;

import com.ankita.jaxrs.model.Person;
import com.ankita.jaxrs.model.Response;

public interface PersonService {

	public Response addPerson(Person p);
	
	public Response deletePerson(int id);
	
	public Person getPerson(int id);
	
	public Person[] getAllPersons();

}