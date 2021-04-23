package com.example.myfirstwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 *This is the main app.
 *@author Joseph and Jester
 *@version 1.0
 *@since March 22, 2021
 *
 *<h1>Git:</h1>
 *<ul>
 * <li>Joseph1899@github.com</li>
 * <li>JesterAlcantara@github.com</li>
 * </ul>
 * <p>This is the main app for the project: myfirstwebservice. </p>
 **/

// http://localhost:8080/swagger-ui/
@SpringBootApplication
@EnableSwagger2
public class WebServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(WebServiceApp.class, args);
	}

}
