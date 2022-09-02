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

    @Column(name = "nombre_area")
    private String nombreArea;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY )
    @JoinColumn(name ="ciudad", referencedColumnName = "id")
    private  Ciudad ciudad;

    @OneToMany(mappedBy = "area", cascade = CascadeType.ALL)
    private List<Activo> Activo = new ArrayList<>();

    public Area() {
    }

    public Area(Integer id, String nombreArea, Ciudad ciudad, List<Activo> activo) {
        this.id = id;
        this.nombreArea = nombreArea;
        this.ciudad = ciudad;
        Activo = activo;
    }

    public Integer getId() { return id;}
    public void setId(Integer id) {this.id = id;}

    public String getNombreArea() {return nombreArea;}
    public void setNombreArea(String nombreCargo) {this.nombreArea = nombreArea;}

    public Ciudad getCiudad() { return ciudad;}
    public void setCiudad(Ciudad ciudad) { this.ciudad = ciudad; }

    public List<Activo> getActivo() { return Activo; }
    public void setActivo(List<Activo> activo) { Activo = activo; }
}

