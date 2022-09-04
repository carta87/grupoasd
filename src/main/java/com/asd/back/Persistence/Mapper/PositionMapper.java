package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.Position;
import com.asd.back.Persistence.Entity.Area;
import org.mapstruct.*;
import java.util.List;

@Mapper(componentModel = "spring", uses =  CityMapper.class  )
public interface  PositionMapper {

    @Mappings({
            @Mapping(source = "nombre", target = "namePosition"),
            @Mapping(source = "ciudad", target = "city"),

    })
    Position toPosition(Area area);
    List<Position> toListPosition(List<Area> areas);

    @InheritInverseConfiguration
    @Mapping(target = "activo", ignore = true)
    Area toCargo(Position position);
}