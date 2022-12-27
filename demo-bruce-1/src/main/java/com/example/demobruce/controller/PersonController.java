package com.example.demobruce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demobruce.entity.PersonEntity;
import com.example.demobruce.repository.PersonRepository;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@GetMapping(value = "/list")	
	public List<PersonEntity> getPerson() { 
		return personRepository.findAll();
	}
	
	@PostMapping(value = "/add")
	public PersonEntity addPerson(PersonEntity savedPerson) {
		PersonEntity person = new PersonEntity();
		person.setId(savedPerson.getId());
		person.setName(savedPerson.getName());
		person.setAge(savedPerson.getAge());
		person.setDob(savedPerson.getDob());
		person.setContact(savedPerson.getContact());
		person.setAddress(savedPerson.getAddress());
        return personRepository.save(person);
    }
	
	@PostMapping(value = "/edit")
	public PersonEntity editPerson(PersonEntity savedPerson) {
		PersonEntity person = new PersonEntity();
		person.setId(savedPerson.getId());
		person.setName(savedPerson.getName());
		person.setAge(savedPerson.getAge());
		person.setDob(savedPerson.getDob());
		person.setContact(savedPerson.getContact());
		person.setAddress(savedPerson.getAddress());
        return personRepository.save(person);
    }
	
	@PostMapping(value = "/delete")
	public List<PersonEntity> deletePerson(PersonEntity savedPerson) {
		personRepository.deleteById(savedPerson.getId());
		PersonEntity person = new PersonEntity();
		return personRepository.findAll();
    }
	
}