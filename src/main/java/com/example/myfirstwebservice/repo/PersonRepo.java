package com.example.myfirstwebservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.myfirstwebservice.entity.Person;
/**
 *This extends PersonRepo to use Jpa Repositories.
 *@author Joseph and Jester
 *@version 1.0
 *@since March 22, 2021
 *
 *<h1>Git:</h1>
 *<ul>
 * <li>Joseph1899@github.com</li>
 * <li>JesterAlcantara@github.com</li>
 * </ul>
 * <p>This allows the PersonRepo to use JpaRepositories for the project: myfirstwebservice. </p>
 **/
public interface PersonRepo extends JpaRepository<Person, Integer> {

}
