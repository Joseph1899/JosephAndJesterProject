package com.example.myfirstwebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.myfirstwebservice.entity.Person;
import com.example.myfirstwebservice.service.PersonRecordService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
/**
*This is the restful api for the entity Person.
*@author Joseph and Jester
*@version 1.0
*@since March 22, 2021
*
*<h1>Git:</h1>
*<ul>
* <li>Joseph1899@github.com</li>
* <li>JesterAlcantara@github.com</li>
* </ul>
* <p>This is the Rest Controller for the entity Person.</p>
**/

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/record")
@Api(value = "Person Rest Controller")
public class PersonRestAPI {
	
	

	/**
	 * This injects the object PersonRecordService as service.
	 * */
	@Autowired	
	PersonRecordService service;
	
	
	/**
	 * 
	 * This gets a single Person data from the table by using this url http://localhost:8080/record/person/id
	 * @return person
	 * */
	@GetMapping("/person/{id}")
	@ApiOperation(value = "Get Person Information", response = Person.class, notes = "Returns a single record of Person table.")
	public Person getPersonInfo(@ApiParam(value = "This is the primary id of the record.") @PathVariable("id") int id) throws Exception {
		Person person = service.getPersonInfo(id);
		return person;		
	}
		
	/**
	 * 
	 * This inserts a single Person data to the table by using this url http://localhost:8080/record/person
	 * @return service.savePersonInfo(person)
	 * */
	  @PostMapping(path = "/person", consumes= "application/json", produces= "application/json")
	  @ApiOperation(value = "Save Person Information", response = Person.class, notes = "Saves a single record of Person table.") 
	  public Person savePersonInfo(@ApiParam(value = "This is the json body that we need to insert in to the record.") @RequestBody Person person) throws Exception { return
	  service.savePersonInfo(person);
	  
	  }
	  
	  /**
		 * 
		 * This updates a single Person data to the table by using this url http://localhost:8080/record/person
		 * @return service.updatePersonInfo(person)
		 * */
	@PutMapping("/person")	
	@ApiOperation(value = "Update Person Information", response = Person.class, notes = "Updates a single record of Person table.")
	public Person updatePersonInfo(@ApiParam(value = "This is the json body that we need to update the record.") @RequestBody Person person) throws Exception {
		return service.updatePersonInfo(person);
	} 
	  /**
			 * 
			 * This deletes a single Person data to the table by using this url http://localhost:8080/record/person?id={person.id}
			 * @return service.deletePersonInfo(person)
			 * */
	@DeleteMapping("/person")	
	@ApiOperation(value = "Delete Person Information", response = Person.class, notes = "Deletes a single record of Person table.")
	public String deletePersonInfo(@ApiParam(value = "This is the id we need to delete the record.") @RequestParam int id){
		return service.deletePersonInfo(id);
	} 
	
}
