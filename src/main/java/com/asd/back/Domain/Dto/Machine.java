package com.asd.back.Domain.Dto;

import javax.persistence.Column;
import java.util.Date;

public class Machine extends Active {

    private String brand;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
