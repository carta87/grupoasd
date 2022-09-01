package com.asd.back.Domain.Repository;

import com.asd.back.Domain.Dto.Person;
import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    List<Person> getAllPerson();
    Optional<Person> getPerson(int id);
    Person savePerson(Person person);
    void deletePerson(int personId);
}
