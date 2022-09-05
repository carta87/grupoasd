package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.MaterialOffice;
import com.asd.back.Persistence.Entity.MaterialOficina;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-04T18:20:54-0500",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.3.1.jar, environment: Java 11.0.14 (Eclipse Adoptium)"
)
@Component
public class TypeMapperImpl implements TypeMapper {

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public MaterialOffice toType(MaterialOficina materialOficina) {
        if ( materialOficina == null ) {
            return null;
        }

        MaterialOffice materialOffice = new MaterialOffice();

        if ( materialOficina.getId() != null ) {
            materialOffice.setId( materialOficina.getId() );
        }
        materialOffice.setCondition( materialOficina.getEstado() );
        materialOffice.setName( materialOficina.getNombre() );
        materialOffice.setDescription( materialOficina.getDescripcion() );
        materialOffice.setType( materialOficina.getTipo() );
        materialOffice.setSerial( materialOficina.getSerial() );
        materialOffice.setNumberInsideInventory( materialOficina.getNumeroInternoInventarioActivo() );
        materialOffice.setWeight( materialOficina.getPeso() );
        materialOffice.setTall( materialOficina.getAlto() );
        materialOffice.setLength( materialOficina.getLargo() );
        materialOffice.setWidth( materialOficina.getAncho() );
        if ( materialOficina.getValorActivo() != null ) {
            materialOffice.setValueActive( materialOficina.getValorActivo() );
        }
        materialOffice.setDatePurchuse( materialOficina.getFechaCompra() );
        materialOffice.setPosition( positionMapper.toPosition( materialOficina.getArea() ) );
        if ( materialOficina.getIdArea() != null ) {
            materialOffice.setIdPosition( materialOficina.getIdArea() );
        }
        if ( materialOficina.getIdEmpleado() != null ) {
            materialOffice.setIdEmployee( materialOficina.getIdEmpleado() );
        }

        return materialOffice;
    }

    @Override
    public List<MaterialOffice> toListTypes(List<MaterialOficina> materialOficinaList) {
        if ( materialOficinaList == null ) {
            return null;
        }

        List<MaterialOffice> list = new ArrayList<MaterialOffice>( materialOficinaList.size() );
        for ( MaterialOficina materialOficina : materialOficinaList ) {
            list.add( toType( materialOficina ) );
        }

        return list;
    }

    @Override
    public MaterialOficina toTipo(MaterialOffice type) {
        if ( type == null ) {
            return null;
        }

        MaterialOficina materialOficina = new MaterialOficina();

        materialOficina.setId( type.getId() );
        materialOficina.setEstado( type.getCondition() );
        materialOficina.setNombre( type.getName() );
        materialOficina.setDescripcion( type.getDescription() );
        materialOficina.setTipo( type.getType() );
        materialOficina.setSerial( type.getSerial() );
        materialOficina.setNumeroInternoInventarioActivo( type.getNumberInsideInventory() );
        materialOficina.setPeso( type.getWeight() );
        materialOficina.setAlto( type.getTall() );
        materialOficina.setLargo( type.getLength() );
        materialOficina.setAncho( type.getWidth() );
        materialOficina.setValorActivo( type.getValueActive() );
        materialOficina.setFechaCompra( type.getDatePurchuse() );
        materialOficina.setArea( positionMapper.toCargo( type.getPosition() ) );
        materialOficina.setIdArea( type.getIdPosition() );
        materialOficina.setIdEmpleado( type.getIdEmployee() );

        return materialOficina;
    }
}
