package com.asd.back.Persistence.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity (name = "inmueble")
@PrimaryKeyJoinColumn(name = "id_inmueble")
public class Inmueble extends Activo {

    private String ubicacion;

    public Inmueble() {
    }

    public String getUbicacion() { return ubicacion;}
    public void setUbicacion(String ubicacion) {this.ubicacion = ubicacion; }

}
