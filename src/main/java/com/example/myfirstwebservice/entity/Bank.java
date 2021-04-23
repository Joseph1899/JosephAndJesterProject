package com.example.myfirstwebservice.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 *Represents the bank of the Person
 *@author Joseph and Jester
 *@version 1.0
 *@since March 22, 2021
 *
 *<h1>Git:</h1>
 *<ul>
 * <li>Joseph1899@github.com</li>
 * <li>JesterAlcantara@github.com</li>
 * </ul>
 * <p>This is the entity for the table Bank in the project: myfirstwebservice. </p>
 **/
@Entity
@Table(name = "Bank")
public class Bank implements Serializable {
	private static final long serialVersionUID = 1L;
	 /**
	 * 
	 * This column named person_id creates a relationship ManyToOne to the column id from the table Person.
	 */
	@ManyToOne
	@JoinColumn(name="person_id")
	@JsonIgnoreProperties(value = "bank")
	private Person person; //Person id
	
	/**
	 * This is a column named id from the table Bank.
	 * */
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	/**
	 * This is a column named accountName from the table Bank.
	 * */
	@Column
	private String accountName;
	
	/**
	 * This is a column named bankAddress from the table Bank.
	 * */
	@Column
	private String bankAddress;
	
	//getter setter
	 /**
	  * Getter for the person field
	  * @return person
	  * */
	public Person getPerson() {
		return person;
	}
	 /**
	  * Setter for the id field
	  * @return id
	  * */
	public void setPerson(Person person) {
		this.person = person;
	}
	 /**
	  * Getter for the id field
	  * @return id
	  * */
	public int getId() {
		return id;
	}
	 /**
	  * Setter for the id field
	  * @return id
	  * */
	public void setId(int id) {
		this.id = id;
	}
	 /**
	  * Getter for the accountName field
	  * @return accountName
	  * */
	public String getAccountName() {
		return accountName;
	}
	 /**
	  * Setter for the accountName field
	  * @return accountName
	  * */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	 /**
	  * Getter for the bankAddress field
	  * @return bankAddress
	  * */
	public String getBankAddress() {
		return bankAddress;
	}
	 /**
	  * Setter for the bankAddress field
	  * @return bankAddress
	  * */
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	
	
	
}