package com.asd.back.Persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "area")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nombre_area")
    private String nombreArea;

    @OneToOne( cascade = {CascadeType.ALL} )
    @JoinColumn(name ="ciudad", referencedColumnName = "id")
    private  Ciudad ciudad;


    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
    private List<Activo> activo = new ArrayList<>();


    public Integer getId() { return id;}
    public void setId(Integer id) {this.id = id;}

    public String getNombreArea() {return nombreArea;}
    public void setNombreArea(String nombreCargo) {this.nombreArea = nombreArea;}

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

