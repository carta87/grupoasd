package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.Position;
import com.asd.back.Persistence.Entity.Cargo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PositionMapper {

    @Mapping(source = "nombreCargo",  target = "namePosition" )

    Position toPosition(Cargo cargo);
    List<Position> toListPosition(List<Cargo> cargos);

    @InheritInverseConfiguration
    Cargo toCargo(Position position);
}
