package com.example.myfirstwebservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myfirstwebservice.dao.PersonDAOImpl;
import com.example.myfirstwebservice.entity.Person;
/**
*This is the Data Transfer Object for the Person.
*@author Joseph and Jester
*@version 1.0
*@since March 22, 2021
*
*<h1>Git:</h1>
*<ul>
* <li>Joseph1899@github.com</li>
* <li>JesterAlcantara@github.com</li>
* </ul>
* <p>This handles the records and CRUD functions for the table Person in the project: myfirstwebservice. </p>
**/
@Service
public class PersonRecordService {
	/**
	 * This injects the object PersonDAOImpl as personDAOImpl.
	 * */
	@Autowired
	PersonDAOImpl personDAOImpl;
	
	/**
	 * This gets or views a single record of a Person.
	 * */
	public Person getPersonInfo(int id) throws Exception {		
		return personDAOImpl.getPersonInfo(id);
	}

	/**
	 * This creates a single record of a Person.
	 * */
		public Person savePersonInfo(Person person) throws Exception {
			// persist means insert record into the table		
			return personDAOImpl.savePersonInfo(person);
	
		}
		/**
		 * This updates a single record of a Person.
		 * */
	public Person updatePersonInfo(Person person) throws Exception {
		return personDAOImpl.updatePersonInfo(person);
	}

	/**
	 * This deletes a single record of a Person.
	 * */
	public String deletePersonInfo(int id) {
		return personDAOImpl.deletePersonInfo(id);
	}
}
