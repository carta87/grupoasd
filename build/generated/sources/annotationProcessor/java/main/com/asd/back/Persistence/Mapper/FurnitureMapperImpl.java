package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.Possession;
import com.asd.back.Persistence.Entity.Inmueble;
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
public class FurnitureMapperImpl implements FurnitureMapper {

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public Possession toFurniture(Inmueble mueble) {
        if ( mueble == null ) {
            return null;
        }

        Possession possession = new Possession();

        if ( mueble.getId() != null ) {
            possession.setId( mueble.getId() );
        }
        possession.setLocation( mueble.getUbicacion() );
        possession.setName( mueble.getNombre() );
        possession.setDescription( mueble.getDescripcion() );
        possession.setType( mueble.getTipo() );
        possession.setSerial( mueble.getSerial() );
        possession.setNumberInsideInventory( mueble.getNumeroInternoInventarioActivo() );
        possession.setWeight( mueble.getPeso() );
        possession.setTall( mueble.getAlto() );
        possession.setLength( mueble.getLargo() );
        possession.setWidth( mueble.getAncho() );
        if ( mueble.getValorActivo() != null ) {
            possession.setValueActive( mueble.getValorActivo() );
        }
        possession.setDatePurchuse( mueble.getFechaCompra() );
        possession.setPosition( positionMapper.toPosition( mueble.getArea() ) );
        if ( mueble.getIdArea() != null ) {
            possession.setIdPosition( mueble.getIdArea() );
        }
        if ( mueble.getIdEmpleado() != null ) {
            possession.setIdEmployee( mueble.getIdEmpleado() );
        }

        return possession;
    }

    @Override
    public List<Possession> toListFurniture(List<Inmueble> muebles) {
        if ( muebles == null ) {
            return null;
        }

        List<Possession> list = new ArrayList<Possession>( muebles.size() );
        for ( Inmueble inmueble : muebles ) {
            list.add( toFurniture( inmueble ) );
        }

        return list;
    }

    @Override
    public Inmueble toMueble(Possession furniture) {
        if ( furniture == null ) {
            return null;
        }

        Inmueble inmueble = new Inmueble();

        inmueble.setId( furniture.getId() );
        inmueble.setUbicacion( furniture.getLocation() );
        inmueble.setNombre( furniture.getName() );
        inmueble.setDescripcion( furniture.getDescription() );
        inmueble.setTipo( furniture.getType() );
        inmueble.setSerial( furniture.getSerial() );
        inmueble.setNumeroInternoInventarioActivo( furniture.getNumberInsideInventory() );
        inmueble.setPeso( furniture.getWeight() );
        inmueble.setAlto( furniture.getTall() );
        inmueble.setLargo( furniture.getLength() );
        inmueble.setAncho( furniture.getWidth() );
        inmueble.setValorActivo( furniture.getValueActive() );
        inmueble.setFechaCompra( furniture.getDatePurchuse() );
        inmueble.setArea( positionMapper.toCargo( furniture.getPosition() ) );
        inmueble.setIdArea( furniture.getIdPosition() );
        inmueble.setIdEmpleado( furniture.getIdEmployee() );

        return inmueble;
    }
}
