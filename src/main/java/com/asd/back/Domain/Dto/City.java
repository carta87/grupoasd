package com.asd.back.Domain.Dto;

public class City {

    private int id;
    private String nameCity;
    private Active active;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNameCity() {return nameCity;}
    public void setNameCity(String nameCity) {this.nameCity = nameCity;}

    public Active getActive() {
        return active;
    }

    public void setActive(Active active) {
        this.active = active;
    }
}