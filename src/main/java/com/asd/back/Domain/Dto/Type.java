package com.asd.back.Domain.Dto;

import javax.persistence.*;

@Entity
@Table
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameType;

    public Integer getId() {return id;}
    public void setId(Integer id) {this.id = id;}

    public String getNameType() {return nameType;}
    public void setNameType(String nameType) {this.nameType = nameType;}
}
