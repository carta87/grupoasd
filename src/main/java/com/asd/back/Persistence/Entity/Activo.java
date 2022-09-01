package com.asd.back.Persistence.Entity;

import javax.persistence.*;
import java.util.Date;
@Entity (name= "activo")
@Inheritance(strategy = InheritanceType.JOINED)
public class Activo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String tipo;
    @Column (name= "num_serial")
    private String serial;
    @Column(name = "num_inventario")
    private String numeroInternoInventarioActivo;
    private String peso;
    private String alto;
    private String largo;
    private String ancho;
    @Column(name = "valor_compra")
    private Integer valorActivo;
    @Column(name = "fecha_compra")
    private Date fechaCompra;

    public Activo() {
    }

    public Activo(Integer id, String nombre, String descripcion, String tipo, String serial, String numeroInternoInventarioActivo, String peso, String alto, String largo, String ancho, Integer valorActivo, Date fechaCompra) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.serial = serial;
        this.numeroInternoInventarioActivo = numeroInternoInventarioActivo;
        this.peso = peso;
        this.alto = alto;
        this.largo = largo;
        this.ancho = ancho;
        this.valorActivo = valorActivo;
        this.fechaCompra = fechaCompra;
    }

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial;}

    public String getNumeroInternoInventarioActivo() {return numeroInternoInventarioActivo;}
    public void setNumeroInternoInventarioActivo(String numeroInternoInventarioActivo) {
        this.numeroInternoInventarioActivo = numeroInternoInventarioActivo;}

    public String getPeso() {return peso;}
    public void setPeso(String peso) {this.peso = peso;}

    public String getAlto() {return alto;}
    public void setAlto(String alto) {this.alto = alto; }

    public String getLargo() { return largo;}
    public void setLargo(String largo) {this.largo = largo; }

    public String getAncho() {return ancho; }
    public void setAncho(String ancho) { this.ancho = ancho; }

    public Integer getValorActivo() {return valorActivo;}
    public void setValorActivo(Integer valorActivo) {this.valorActivo = valorActivo;}

    public Date getFechaCompra() {return fechaCompra;}
    public void setFechaCompra(Date fechaCompra) {this.fechaCompra = fechaCompra;}


}
