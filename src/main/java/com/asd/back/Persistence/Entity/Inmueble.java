package com.asd.back.Persistence.Entity;

import javax.persistence.*;

@Entity (name = "inmueble")
@PrimaryKeyJoinColumn(name = "id_inmueble")
public class Inmueble extends Activo {
    @Id
    @GeneratedValue
    private Integer id;
    private String ubicacion;

    @Override
    public Integer getId() {
        return id;
    }
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUbicacion() { return ubicacion;}
    public void setUbicacion(String ubicacion) {this.ubicacion = ubicacion; }

}
