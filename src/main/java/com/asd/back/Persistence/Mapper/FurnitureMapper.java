package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.Possession;
import com.asd.back.Persistence.Entity.Inmueble;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = PositionMapper.class)
public interface FurnitureMapper {
    @Mappings({
            @Mapping(source = "ubicacion", target = "location"),
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
            @Mapping(source = "idArea", target = "idPosition"),
            @Mapping(source = "idEmpleado", target = "idEmployee"),

    })
    Possession toFurniture(Inmueble mueble);
    List<Possession> toListFurniture(List<Inmueble> muebles);

    @InheritInverseConfiguration
    Inmueble toMueble(Possession furniture);
}
