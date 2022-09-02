package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.Machine;
import com.asd.back.Persistence.Entity.Maquinaria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = PositionMapper.class)
public interface MachineMapper  {

    @Mappings({
            @Mapping(source = "marca", target = "brand"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "tipo", target = "type"),
            @Mapping(source = "serial", target = "serial"),
            @Mapping(source = "numeroInternoInventarioActivo", target = "numberInsideInventory"),
            @Mapping(source = "peso", target = "weight"),
            @Mapping(source = "alto", target = "tall"),
            @Mapping(source = "largo", target = "length"),
            @Mapping(source = "ancho", target = "width"),
            @Mapping(source = "valorActivo", target = "valueActive"),
            @Mapping(source = "fechaCompra", target = "datePurchuse"),
            @Mapping(source = "area", target = "position"),

    })
    Machine toMachine(Maquinaria maquinaria);
    List<Machine> toListMachine(List<Maquinaria> maquinarias);

    @InheritInverseConfiguration
    Maquinaria toMaquinaria(Machine machine);
}
