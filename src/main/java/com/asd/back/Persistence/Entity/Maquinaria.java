package com.asd.back.Persistence.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity (name = "maquinaria")
@PrimaryKeyJoinColumn(name = "id_maquinaria")
public class Maquinaria extends Activo {

    private String marca;

    public Maquinaria() {
    }

    public Maquinaria(String marca) {
        this.marca = marca;
    }

    public Maquinaria(Integer id, String nombre, String descripcion, String tipo, String serial, String numeroInternoInventarioActivo, String peso, String alto, String largo, String ancho, Integer valorActivo, Date fechaCompra, String marca) {
        super(id, nombre, descripcion, tipo, serial, numeroInternoInventarioActivo, peso, alto, largo, ancho, valorActivo, fechaCompra);
        this.marca = marca;
    }

    public Maquinaria(Integer id, String nombre, String descripcion, String tipo, String serial, String numeroInternoInventarioActivo, String peso, String alto, String largo, String ancho, Integer valorActivo, Date fechaCompra, Area area, String marca) {
        super(id, nombre, descripcion, tipo, serial, numeroInternoInventarioActivo, peso, alto, largo, ancho, valorActivo, fechaCompra, area);
        this.marca = marca;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }


}