package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.City;
import com.asd.back.Domain.Dto.Position;
import com.asd.back.Persistence.Entity.Area;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = CityMapper.class)
public interface PositionMapper {

    @Mappings(value = {
            @Mapping(source = "nombreArea", target = "namePosition"),
            @Mapping(source = "ciudad", target = "city"),


    })

    Position toPosition(Area cargo);
    List<Position> toListPosition(List<Area> cargos);

    @InheritInverseConfiguration
    Area toCargo(Position position);


}
