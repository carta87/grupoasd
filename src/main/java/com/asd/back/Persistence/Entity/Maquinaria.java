package com.asd.back.Persistence.Entity;

import javax.persistence.*;

@Entity (name = "maquinaria")
@PrimaryKeyJoinColumn(name = "id_maquinaria")
public class Maquinaria extends Activo {
    @Id
    @GeneratedValue
    private Integer id;
    private String marca;

    @Override
    public Integer getId() { return id; }
    @Override
    public void setId(Integer id) { this.id = id;  }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }


}