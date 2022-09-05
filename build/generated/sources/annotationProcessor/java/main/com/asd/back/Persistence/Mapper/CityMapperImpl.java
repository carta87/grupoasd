package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.City;
import com.asd.back.Persistence.Entity.Ciudad;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-04T18:20:53-0500",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.3.1.jar, environment: Java 11.0.14 (Eclipse Adoptium)"
)
@Component
public class CityMapperImpl implements CityMapper {

    @Override
    public City toCity(Ciudad ciudad) {
        if ( ciudad == null ) {
            return null;
        }

        City city = new City();

        city.setNameCity( ciudad.getNombreCiudad() );
        if ( ciudad.getId() != null ) {
            city.setId( ciudad.getId() );
        }

        return city;
    }

    @Override
    public List<City> toListCity(List<Ciudad> ciudads) {
        if ( ciudads == null ) {
            return null;
        }

        List<City> list = new ArrayList<City>( ciudads.size() );
        for ( Ciudad ciudad : ciudads ) {
            list.add( toCity( ciudad ) );
        }

        return list;
    }

    @Override
    public Ciudad toCiudad(City city) {
        if ( city == null ) {
            return null;
        }

        Ciudad ciudad = new Ciudad();

        ciudad.setNombreCiudad( city.getNameCity() );
        ciudad.setId( city.getId() );

        return ciudad;
    }
}
