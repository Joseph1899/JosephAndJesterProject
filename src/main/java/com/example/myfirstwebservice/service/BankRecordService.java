/*
 * This handles the records for the Bank.
 * */
package com.example.myfirstwebservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myfirstwebservice.dao.BankDAOImpl;
import com.example.myfirstwebservice.entity.Bank;
import com.example.myfirstwebservice.entity.Person;

/**
*This is the Data Transfer Object for the Bank.
*@author Joseph and Jester
*@version 1.0
*@since March 22, 2021
*
*<h1>Git:</h1>
*<ul>
* <li>Joseph1899@github.com</li>
* <li>JesterAlcantara@github.com</li>
* </ul>
* <p>This handles the records and CRUD functions for the table Bank in the project: myfirstwebservice. </p>
**/

@Service
public class BankRecordService {
	/**
	 * This injects the object BankDAOImpl as bankDAOImpl.
	 * */
	@Autowired
	BankDAOImpl bankDAOImpl;
	
	/**
	 * This gets or views a single record of a Bank.
	 * */
	public Bank getBankInfo(int Id) throws Exception {		
		return bankDAOImpl.getBankInfo(Id);
	}

	/**
	 * This creates a single record of a Bank.
	 * */
	public Bank saveBankInfo(Bank bank) throws Exception {
		// persist means insert record into the table
		return bankDAOImpl.saveBankInfo(bank);
	}

	/**
	 * This updates a single record of a Bank.
	 * */
	public Bank updateBankInfo(Bank bank) throws Exception {
		return bankDAOImpl.updateBankInfo(bank);
	}
	
	/**
	 * This deletes a single record of a Bank.
	 * */
	public String deleteBankInfo(int Id) {
		return bankDAOImpl.deleteBankInfo(Id);
	}
}
