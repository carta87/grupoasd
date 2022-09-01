package com.asd.back.Persistence;

import com.asd.back.Domain.Dto.Person;
import com.asd.back.Domain.Repository.PersonRepository;
import com.asd.back.Persistence.CRUD.PersonaCRUDRepository;
import com.asd.back.Persistence.Entity.Persona;
import com.asd.back.Persistence.Mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PersonaRepository implements PersonRepository {

    @Autowired
    private PersonaCRUDRepository personaCRUDRepository;

    @Autowired
    private PersonMapper personMapper;


    @Override
    public List<Person> getAllPerson() {
        List<Persona> personas = (List<Persona>) personaCRUDRepository.findAll();
        return personMapper.toListPerson(personas);
    }

    @Override
    public Optional<Person> getPerson(int id) {
        return personaCRUDRepository.findById(id).map(Person -> personMapper.toPerson(Person));
    }

    @Override
    public Person savePerson(Person person) {
        Persona persona = personMapper.toPersona(person);
        return personMapper.toPerson(personaCRUDRepository.save(persona));
    }

    @Override
    public void deletePerson(int personId) {
        personaCRUDRepository.deleteById(personId);
    }
}
