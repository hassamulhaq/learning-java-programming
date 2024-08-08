package com.example.constructor;

public class ConstructorOverloadingCar {
    public String brand;

    ConstructorOverloadingCar() {
        this.brand = "php ;)";
    }

    ConstructorOverloadingCar(String brand) {
        this.brand = brand;
    }

    void getName() {
        System.out.println("Brand is: " + this.brand);
    }

    public static void main(String[] args) {
        ConstructorOverloadingCar car = new ConstructorOverloadingCar("java");
        car.getName();
    }
}
