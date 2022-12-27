package com.example.demobruce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demobruce.entity.PersonEntity;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {
	  
}

//@Repository
//public class PersonRepository implements PersonRepositoryInterface {
//	private Map<String, PersonEntity> repository;
//	
//    public PersonRepository() {
//        this.repository = new HashMap<>();
//    }
//  
//    // Implementation for save method
//    public void save(PersonEntity person) {
//        repository.put(person.getName(), person);
//    }
//  
//    // Implementation for findStudentById method
//    public PersonEntity findPersonById(int id) {
//        return repository.get("id");
//    }
//    
//    // find all
//    public PersonEntity findAllPerson() {
//        return repository;
//    }
//}
