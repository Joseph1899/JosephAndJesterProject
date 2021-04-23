package com.example.myfirstwebservice.controller;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.stream.Stream;
/**
*This handles custom errors.
*@author Joseph and Jester
*@version 1.0
*@since March 22, 2021
*
*<h1>Git:</h1>
*<ul>
* <li>Joseph1899@github.com</li>
* <li>JesterAlcantara@github.com</li>
* </ul>
* <p>This is the object that handles custom error.</p>
**/

public enum MessageType {

	RECORD_EXIST("Record is already existed"),
	RECORD_DELETED("Record has been deleted."),
	INSERT_SUCCESS("Record has been inserted."),
	UPDATE_ONLY("You can only Update here. No record found!"),
	RECORD_NOT_FOUND("Record not found");
	
	

	private String code;
	
	private MessageType(String code) {
		this.code = code;
	}
	
	public static MessageType decode(final String error) {		
		return Stream.of(MessageType.values())
				.filter(e -> e.code.equals(error))
				.findFirst().orElse(null);
	}
	
	@JsonValue
	public String getCode() {
		return code;
	}
}