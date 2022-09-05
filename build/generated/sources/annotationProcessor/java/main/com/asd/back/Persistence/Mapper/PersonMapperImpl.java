package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.Person;
import com.asd.back.Persistence.Entity.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-04T18:20:52-0500",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.3.1.jar, environment: Java 11.0.14 (Eclipse Adoptium)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person toPerson(Persona persona) {
        if ( persona == null ) {
            return null;
        }

        Person person = new Person();

        person.setName( persona.getNombre() );
        if ( persona.getIdentificacion() != null ) {
            person.setIdentification( persona.getIdentificacion() );
        }
        if ( persona.getId() != null ) {
            person.setId( persona.getId() );
        }

        return person;
    }

    @Override
    public List<Person> toListPerson(List<Persona> personas) {
        if ( personas == null ) {
            return null;
        }

        List<Person> list = new ArrayList<Person>( personas.size() );
        for ( Persona persona : personas ) {
            list.add( toPerson( persona ) );
        }

        return list;
    }
}
