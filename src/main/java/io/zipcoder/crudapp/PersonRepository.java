package io.zipcoder.crudapp;

import io.zipcoder.crudapp.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer>{
}
