package com.asd.back.Persistence.Entity;

import javax.persistence.*;

@Entity
@Table( name= "tipo")
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombretipo")
    private String nombreTipo;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getNombreTipo() {return nombreTipo;}
    public void setNombreTipo(String nombreTipo) {this.nombreTipo = nombreTipo;}
}
