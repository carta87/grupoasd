package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.Active;
import com.asd.back.Persistence.Entity.Activo;
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
public class ActiveMapperImpl implements ActiveMapper {

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public Active toActive(Activo activo) {
        if ( activo == null ) {
            return null;
        }

        Active active = new Active();

        if ( activo.getId() != null ) {
            active.setId( activo.getId() );
        }
        active.setName( activo.getNombre() );
        active.setDescription( activo.getDescripcion() );
        active.setType( activo.getTipo() );
        active.setSerial( activo.getSerial() );
        active.setNumberInsideInventory( activo.getNumeroInternoInventarioActivo() );
        active.setWeight( activo.getPeso() );
        active.setTall( activo.getAlto() );
        active.setLength( activo.getLargo() );
        active.setWidth( activo.getAncho() );
        if ( activo.getValorActivo() != null ) {
            active.setValueActive( activo.getValorActivo() );
        }
        active.setDatePurchuse( activo.getFechaCompra() );
        if ( activo.getIdArea() != null ) {
            active.setIdPosition( activo.getIdArea() );
        }
        if ( activo.getIdEmpleado() != null ) {
            active.setIdEmployee( activo.getIdEmpleado() );
        }
        active.setPosition( positionMapper.toPosition( activo.getArea() ) );

        return active;
    }

    @Override
    public List<Active> toListActive(List<Activo> activos) {
        if ( activos == null ) {
            return null;
        }

        List<Active> list = new ArrayList<Active>( activos.size() );
        for ( Activo activo : activos ) {
            list.add( toActive( activo ) );
        }

        return list;
    }

    @Override
    public Activo toActivo(Active active) {
        if ( active == null ) {
            return null;
        }

        Activo activo = new Activo();

        activo.setId( active.getId() );
        activo.setNombre( active.getName() );
        activo.setDescripcion( active.getDescription() );
        activo.setTipo( active.getType() );
        activo.setSerial( active.getSerial() );
        activo.setNumeroInternoInventarioActivo( active.getNumberInsideInventory() );
        activo.setPeso( active.getWeight() );
        activo.setAlto( active.getTall() );
        activo.setLargo( active.getLength() );
        activo.setAncho( active.getWidth() );
        activo.setValorActivo( active.getValueActive() );
        activo.setFechaCompra( active.getDatePurchuse() );
        activo.setIdArea( active.getIdPosition() );
        activo.setIdEmpleado( active.getIdEmployee() );
        activo.setArea( positionMapper.toCargo( active.getPosition() ) );

        return activo;
    }
}
