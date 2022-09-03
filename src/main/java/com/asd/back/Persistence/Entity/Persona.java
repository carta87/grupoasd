package com.asd.back.Persistence.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "empleado")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Integer identificacion;

    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
    private List<Activo> activo = new ArrayList<>();

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public Integer getIdentificacion() {return identificacion;}
    public void setIdentificacion(Integer identificacion) {this.identificacion = identificacion;}

    public List<Activo> getActivo() {
        return activo;
    }

    public void setActivo(List<Activo> activo) {
        this.activo = activo;
    }
}
