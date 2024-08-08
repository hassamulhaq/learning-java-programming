package com.example;

public class Bicycle {

    private int gear = 5;
    private String color = "red";
    private String model = "CK-8788";

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
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

    public void braking() {
        System.out.println("Bicycle is braking");
    }
}

//Bicycle hammerCycle = new Bicycle();

