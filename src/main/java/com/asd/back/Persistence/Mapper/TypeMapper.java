package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.Type;
import com.asd.back.Persistence.Entity.Tipo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypeMapper {

    @Mapping(source = "nombreTipo", target = "nameType")

    Type toType(Tipo tipo);
    List<Type> toListTypes(List<Tipo> tipos);

    @InheritInverseConfiguration
    Tipo toTipo(Type type);
}
