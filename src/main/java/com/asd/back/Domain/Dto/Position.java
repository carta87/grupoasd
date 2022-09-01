package com.asd.back.Domain.Dto;

public class Position  {
    private int id;
    private String namePosition;
    private City city;

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNamePosition() {return namePosition;}
    public void setNamePosition(String namePosition) {this.namePosition = namePosition;}

    public City getCity() { return city; }
    public void setCity(City city) { this.city = city; }
}
