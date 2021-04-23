package com.example.myfirstwebservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myfirstwebservice.entity.Bank;
/**
 *This extends the BankRepo to use JpaRepositories
 *@author Joseph and Jester
 *@version 1.0
 *@since March 22, 2021
 *
 *<h1>Git:</h1>
 *<ul>
 * <li>Joseph1899@github.com</li>
 * <li>JesterAlcantara@github.com</li>
 * </ul>
 * <p>This allows the BankRepo to use JpaRepositories for the project: myfirstwebservice. </p>
 **/
public interface BankRepo extends JpaRepository <Bank, Integer>{
	
}
