package com.asd.back.Persistence.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "area")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @OneToOne( cascade = {CascadeType.ALL} )
    @JoinColumn(name ="ciudad", referencedColumnName = "id")
    private  Ciudad ciudad;
    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
    private List<Activo> activo = new ArrayList<>();


    public Integer getId() { return id;}
    public void setId(Integer id) {this.id = id;}

    public String getNombre() { return nombre;}
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Ciudad getCiudad() {
        return ciudad;
    }
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public List<Activo> getActivo() {
        return activo;
    }
    public void setActivo(List<Activo> activo) {
        this.activo = activo;
    }
}

