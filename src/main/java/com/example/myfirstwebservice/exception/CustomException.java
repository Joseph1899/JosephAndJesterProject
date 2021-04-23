package com.example.myfirstwebservice.exception;
/**
*This handles the Custom Exceptions.
*@author Joseph and Jester
*@version 1.0
*@since March 22, 2021
*
*<h1>Git:</h1>
*<ul>
* <li>Joseph1899@github.com</li>
* <li>JesterAlcantara@github.com</li>
* </ul>
* <p>This handles custom exceptions for the project: myfirstwebservice. </p>
**/
public class CustomException extends Exception  {

	private static final long serialVersionUID = 1L;

	public CustomException(String message) {
		super(message);
	}
}

