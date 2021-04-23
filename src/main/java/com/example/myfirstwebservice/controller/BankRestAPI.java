/*this is the controller package*/
package com.example.myfirstwebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.example.myfirstwebservice.entity.Bank;
import com.example.myfirstwebservice.entity.Person;
import com.example.myfirstwebservice.service.BankRecordService;
import com.example.myfirstwebservice.service.PersonRecordService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
/**
 *This is the restful api for the entity Bank.
 *@author Joseph and Jester
 *@version 1.0
 *@since March 22, 2021
 *
 *<h1>Git:</h1>
 *<ul>
 * <li>Joseph1899@github.com</li>
 * <li>JesterAlcantara@github.com</li>
 * </ul>
 * <p>This is the Rest Controller for the entity Bank.</p>
 **/

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/bankrecord")
@Api(value = "Bank Rest Controller")
public class BankRestAPI {
	/**
	 * This injects the object BankRecordService as bservice.
	 * */
	@Autowired
	BankRecordService bservice;
	/**
	 * This injects the object PersonRecordService as personService.
	 * */
	@Autowired
	PersonRecordService personService;

	/**
	 * 
	 * This gets a single Bank data from the table by using this url http://localhost:8080/bankrecord/bank/id
	 * @return bank
	 * */
	@GetMapping("/bank/{id}")
	@ApiOperation(value = "Get Bank Information", response = Bank.class, notes = "Returns a single record of Bank table.")
	public Bank getBankInfo(@ApiParam(value = "This is the primary id of the record.") @PathVariable("id") int id) throws Exception {
		Bank bank = bservice.getBankInfo(id);
		return bank;		
	}

	/**
	 * 
	 * This inserts a single Bank data to the table by using this url http://localhost:8080/bankrecord/bank
	 * @return bservice.saveBankInfo(bank)
	 * */
	@PostMapping("/bank")
	@ApiOperation(value = "Post Bank Information", response = Bank.class, notes = "Saves a single record of Bank table.")
	public Bank saveBankInfo(@ApiParam(value = "This is the json body that we need to save the record.")@RequestBody Bank bank) throws Exception {
		return bservice.saveBankInfo(bank);
	}
	/**
	 * 
	 * This updates a single Bank data to the table by using this url http://localhost:8080/bankrecord/bank/{personId}
	 * @return bservice.updateBankInfo(bank)
	 * */
	@PutMapping("/bank/{personId}")
	@ApiOperation(value = "Get Bank Information", response = Bank.class, notes = "Updates a single record of Bank table.")
	public Bank updateBankInfo (@ApiParam(value = "This is the json body that we need to update the record.")@RequestBody Bank bank, @ApiParam(value = "This is primary id of the record form Person table.")@PathVariable(name = "personId") int personId)  throws Exception {
		Person p = personService.getPersonInfo(personId);
		bank.setPerson(p);
		return bservice.updateBankInfo(bank);
	}
	
	/**
	 * 
	 * This deletes a single Bank data to the table by using this url http://localhost:8080/bankrecord/bank?id={bank.id}
	 * @return bservice.updateBankInfo(bank)
	 * */
	// http://localhost:8080/bankrecord/bank?id={bank.id}
	@DeleteMapping("/bank")
	@ApiOperation(value = "Get Bank Information", response = Bank.class, notes = "Deletes a single record of Bank table.")
	public String deleteBankInfo(@ApiParam(value = "This is the id that we need to delete the record.")@RequestParam int id) {
		return bservice.deleteBankInfo(id);
	}
}