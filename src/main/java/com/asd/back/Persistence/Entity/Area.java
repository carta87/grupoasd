package com.asd.back.Persistence.Entity;

import javax.persistence.*;

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

    public  Area(Integer id, String nombreArea, Ciudad ciudad) {
        this.id = id;
        this.nombreArea = nombreArea;
        this.ciudad = ciudad;
    }


    public Area() {
    }

    public Integer getId() { return id;}
    public void setId(Integer id) {this.id = id;}

    public String getNombreArea() {return nombreArea;}
    public void setNombreArea(String nombreCargo) {this.nombreArea = nombreArea;}

    public Ciudad getCiudad() { return ciudad;}
    public void setCiudad(Ciudad ciudad) { this.ciudad = ciudad; }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", nombreArea='" + nombreArea + '\'' +
                ", ciudad=" + ciudad +
                '}';
    }
}

