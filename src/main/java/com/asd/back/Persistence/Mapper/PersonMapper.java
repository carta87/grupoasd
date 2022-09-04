package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.Person;
import com.asd.back.Persistence.Entity.Persona;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mappings({
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "identificacion", target = "identification")
    })
    Person toPerson(Persona persona);
    List<Person> toListPerson(List<Persona> personas);

    @InheritInverseConfiguration
    default Persona toPersona(Person ignoredPerson) {
        return null;
    }
}
