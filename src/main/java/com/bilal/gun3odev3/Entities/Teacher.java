package com.bilal.gun3odev3.Entities;

public class Teacher {
    private int id;

    private String name;
    private String lName;



    public Teacher(int id, String name, String lName) {
        this.id = id;
        this.name = name;
        this.lName=lName;
    }

    public Teacher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
