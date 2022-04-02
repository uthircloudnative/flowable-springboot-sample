package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Person;

/**
 * @author Uthiraraj Saminathan
 *
 */
public interface PersonRepository extends JpaRepository<Person, Long>{
	
	Person findByUsername(String username);

}
