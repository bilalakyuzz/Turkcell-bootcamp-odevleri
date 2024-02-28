package com.bilal.gun3odev3.Entities;

import java.util.List;

public class Course {
    private int Id;
    private String Name;
    private double unitPrice;

    public Course(int id, String name, double unitPrice) {
        Id = id;
        Name = name;
        this.unitPrice = unitPrice;
    }

    public Course() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
