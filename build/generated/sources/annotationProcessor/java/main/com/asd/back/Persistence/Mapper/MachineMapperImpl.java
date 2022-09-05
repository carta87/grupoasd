package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.Machine;
import com.asd.back.Persistence.Entity.Maquinaria;
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
public class MachineMapperImpl implements MachineMapper {

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public Machine toMachine(Maquinaria maquinaria) {
        if ( maquinaria == null ) {
            return null;
        }

        Machine machine = new Machine();

        if ( maquinaria.getId() != null ) {
            machine.setId( maquinaria.getId() );
        }
        machine.setBrand( maquinaria.getMarca() );
        machine.setName( maquinaria.getNombre() );
        machine.setDescription( maquinaria.getDescripcion() );
        machine.setType( maquinaria.getTipo() );
        machine.setSerial( maquinaria.getSerial() );
        machine.setNumberInsideInventory( maquinaria.getNumeroInternoInventarioActivo() );
        machine.setWeight( maquinaria.getPeso() );
        machine.setTall( maquinaria.getAlto() );
        machine.setLength( maquinaria.getLargo() );
        machine.setWidth( maquinaria.getAncho() );
        if ( maquinaria.getValorActivo() != null ) {
            machine.setValueActive( maquinaria.getValorActivo() );
        }
        machine.setDatePurchuse( maquinaria.getFechaCompra() );
        if ( maquinaria.getIdArea() != null ) {
            machine.setIdPosition( maquinaria.getIdArea() );
        }
        if ( maquinaria.getIdEmpleado() != null ) {
            machine.setIdEmployee( maquinaria.getIdEmpleado() );
        }
        machine.setPosition( positionMapper.toPosition( maquinaria.getArea() ) );

        return machine;
    }

    @Override
    public List<Machine> toListMachine(List<Maquinaria> maquinarias) {
        if ( maquinarias == null ) {
            return null;
        }

        List<Machine> list = new ArrayList<Machine>( maquinarias.size() );
        for ( Maquinaria maquinaria : maquinarias ) {
            list.add( toMachine( maquinaria ) );
        }

        return list;
    }

    @Override
    public Maquinaria toMaquinaria(Machine machine) {
        if ( machine == null ) {
            return null;
        }

        Maquinaria maquinaria = new Maquinaria();

        maquinaria.setId( machine.getId() );
        maquinaria.setMarca( machine.getBrand() );
        maquinaria.setNombre( machine.getName() );
        maquinaria.setDescripcion( machine.getDescription() );
        maquinaria.setTipo( machine.getType() );
        maquinaria.setSerial( machine.getSerial() );
        maquinaria.setNumeroInternoInventarioActivo( machine.getNumberInsideInventory() );
        maquinaria.setPeso( machine.getWeight() );
        maquinaria.setAlto( machine.getTall() );
        maquinaria.setLargo( machine.getLength() );
        maquinaria.setAncho( machine.getWidth() );
        maquinaria.setValorActivo( machine.getValueActive() );
        maquinaria.setFechaCompra( machine.getDatePurchuse() );
        maquinaria.setIdArea( machine.getIdPosition() );
        maquinaria.setIdEmpleado( machine.getIdEmployee() );
        maquinaria.setArea( positionMapper.toCargo( machine.getPosition() ) );

        return maquinaria;
    }
}
