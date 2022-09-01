package com.asd.back.Persistence.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity (name = "inmueble")
@PrimaryKeyJoinColumn(name = "id_inmueble")
public class Inmueble extends Activo {

    private String ubicacion;

    public Inmueble() {
    }

    public Inmueble(Integer id, String nombre, String descripcion, String tipo, String serial, String numeroInternoInventarioActivo, String peso, String alto, String largo, String ancho, Integer valorActivo, Date fechaCompra, String ubicacion) {
        super(id, nombre, descripcion, tipo, serial, numeroInternoInventarioActivo, peso, alto, largo, ancho, valorActivo, fechaCompra);
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() { return ubicacion;}
    public void setUbicacion(String ubicacion) {this.ubicacion = ubicacion; }


}
