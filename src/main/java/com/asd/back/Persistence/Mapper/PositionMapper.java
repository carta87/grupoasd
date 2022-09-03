package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.City;
import com.asd.back.Domain.Dto.Position;
import com.asd.back.Persistence.Entity.Area;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring", uses =  CityMapper.class  )
public abstract class PositionMapper {

    @Mappings({
            @Mapping(source = "nombreArea", target = "namePosition"),
            @Mapping(source = "ciudad", target = "city"),


    })
    public abstract Position toPosition(Area cargo);
    public abstract List<Position> toListPosition(List<Area> cargos);

    @InheritInverseConfiguration
    @Mapping(target = "activo", ignore = true)
    public abstract Area toCargo(Position position);
}