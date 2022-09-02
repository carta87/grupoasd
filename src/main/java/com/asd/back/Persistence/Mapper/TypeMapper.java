package com.asd.back.Persistence.Mapper;

import com.asd.back.Domain.Dto.MaterialOffice;
import com.asd.back.Persistence.Entity.MaterialOficina;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = PositionMapper.class)
public interface TypeMapper {

    @Mappings({
            @Mapping( source = "estado", target = "condition"),
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
    MaterialOffice toType(MaterialOficina tipo);
    List<MaterialOffice> toListTypes(List<MaterialOficina> tipos);

    @InheritInverseConfiguration

    MaterialOficina toTipo(MaterialOffice type);
}
