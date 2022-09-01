package com.asd.back.Domain.Service;

import com.asd.back.Domain.Dto.Person;
import com.asd.back.Domain.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPerson(){return personRepository.getAllPerson();}

    public Optional<Person> getPerson(int id){
        return personRepository.getPerson(id); }

    public Person savePerson(Person person){
        return personRepository.savePerson(person);}

    public boolean deletePerson(int personaId){
        return getPerson(personaId).map(person ->{
           personRepository.deletePerson(personaId);
           return true;
        }).orElse(false);
    }
}
