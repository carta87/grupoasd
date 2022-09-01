package com.asd.back.Persistence.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity ( name= "material_oficina")
@PrimaryKeyJoinColumn(name = "id_material_oficina")
public class MaterialOficina extends Activo{


    private String estado;

    public MaterialOficina() {
    }

    public MaterialOficina(Integer id, String nombre, String descripcion, String tipo, String serial, String numeroInternoInventarioActivo,
                           String peso, String alto, String largo, String ancho, Integer valorActivo, Date fechaCompra, String estado) {
        super(id, nombre, descripcion, tipo, serial, numeroInternoInventarioActivo, peso, alto, largo, ancho, valorActivo, fechaCompra);
        this.estado = estado;
    }

    public String getEstado() { return estado; }
    public void setEstado(String estado) {  this.estado = estado; }


}
