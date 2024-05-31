package com.pitang.testeTecnico.model;

public class Carro {
    private String name;
    private int year;
    private String licensePlate;
    private String model;
    private String color;

    public Carro(String name, int year, String licensePlate, String model, String color) {
        this.name = name;
        this.year = year;
        this.licensePlate = licensePlate;
        this.model = model;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}