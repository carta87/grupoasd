package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.Position;
import com.asd.back.Persistence.Entity.Area;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-04T18:20:53-0500",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.3.1.jar, environment: Java 11.0.14 (Eclipse Adoptium)"
)
@Component
public class PositionMapperImpl implements PositionMapper {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public Position toPosition(Area area) {
        if ( area == null ) {
            return null;
        }

        Position position = new Position();

        position.setNamePosition( area.getNombre() );
        position.setCity( cityMapper.toCity( area.getCiudad() ) );
        if ( area.getId() != null ) {
            position.setId( area.getId() );
        }

        return position;
    }

    @Override
    public List<Position> toListPosition(List<Area> areas) {
        if ( areas == null ) {
            return null;
        }

        List<Position> list = new ArrayList<Position>( areas.size() );
        for ( Area area : areas ) {
            list.add( toPosition( area ) );
        }

        return list;
    }

    @Override
    public Area toCargo(Position position) {
        if ( position == null ) {
            return null;
        }

        Area area = new Area();

        area.setNombre( position.getNamePosition() );
        area.setCiudad( cityMapper.toCiudad( position.getCity() ) );
        area.setId( position.getId() );

        return area;
    }
}
