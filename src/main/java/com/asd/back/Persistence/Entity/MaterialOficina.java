package com.asd.back.Persistence.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity ( name= "material_oficina")
@PrimaryKeyJoinColumn(name = "id_material_oficina")
public class MaterialOficina extends Activo{

    private String estado;

    public MaterialOficina() {
    }

    public String getEstado() { return estado; }
    public void setEstado(String estado) {  this.estado = estado; }

}
