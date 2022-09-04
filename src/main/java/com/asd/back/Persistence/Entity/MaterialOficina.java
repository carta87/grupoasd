package com.asd.back.Persistence.Entity;

import javax.persistence.*;

@Entity ( name= "material_oficina")
@PrimaryKeyJoinColumn(name = "id_material_oficina")
public class MaterialOficina extends Activo{
    @Id
    @GeneratedValue
    private Integer id;
    private String estado;

    @Override
    public Integer getId() { return id; }
    @Override
    public void setId(Integer id) { this.id = id; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) {  this.estado = estado; }

}
