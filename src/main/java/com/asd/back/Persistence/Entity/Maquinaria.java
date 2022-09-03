package com.asd.back.Persistence.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity (name = "maquinaria")
@PrimaryKeyJoinColumn(name = "id_maquinaria")
public class Maquinaria extends Activo {

    private String marca;

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }


}