package com.asd.back.Domain.Dto;

import java.time.LocalDateTime;
import java.util.Date;

public class Active {
    private int id;
    private String name;
    private String description;
    private String type;
    private String serial;
    private String numberInsideInventory;
    private String weight;
    private String tall;
    private String length;
    private String width;
    private int idEmployee;
    private int idPosition;
    private int valueActive;
    private Date  datePurchuse;
    private Position position;


    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

    public String getName() { return name;}
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description;}
    public void setDescription(String description) {this.description = description; }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public String getNumberInsideInventory() { return numberInsideInventory; }
    public void setNumberInsideInventory(String numberInsideInventory) {
        this.numberInsideInventory = numberInsideInventory; }

    public String getWeight() { return weight; }
    public void setWeight(String weight) { this.weight = weight;  }

    public String getTall() { return tall; }
    public void setTall(String tall) { this.tall = tall;  }

    public String getLength() { return length;  }
    public void setLength(String length) { this.length = length; }

    public String getWidth() { return width; }
    public void setWidth(String width) { this.width = width; }

    public int getIdEmployee() { return idEmployee;}
    public void setIdEmployee(int idEmployee) {this.idEmployee = idEmployee; }

    public int getIdPosition() { return idPosition; }
    public void setIdPosition(int idPosition) { this.idPosition = idPosition; }

    public int getValueActive() {return valueActive;}
    public void setValueActive(int valueActive) {this.valueActive = valueActive;}

    public Date getDatePurchuse() {return datePurchuse;}
    public void setDatePurchuse(Date datePurchuse) {this.datePurchuse = datePurchuse;}

    public Position getPosition() {  return position; }
    public void setPosition(Position position) {  this.position = position; }
}