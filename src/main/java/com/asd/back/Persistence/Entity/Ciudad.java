package com.asd.back.Persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "ciudad")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre_ciudad")
    private String nombreCiudad;

    public Ciudad() {
    }

    public Ciudad(Integer id, String nombreCiudad) {
        this.id = id;
        this.nombreCiudad = nombreCiudad;
    }

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getNombreCiudad() {return nombreCiudad;}
    public void setNombreCiudad(String nombreCiudad) {this.nombreCiudad = nombreCiudad;}

    @Override
    public String toString() {
        return "Ciudad{" +
                "id=" + id +
                ", nombreCiudad='" + nombreCiudad + '\'' +
                '}';
    }
}