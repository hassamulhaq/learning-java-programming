package com.example.constructor;

public class ParameterizedCar {
    private String language = "arabic";

    ParameterizedCar(String lang) {
        language = lang;
    }

    public static void main(String[] args) {
        ParameterizedCar car = new ParameterizedCar("cairo");
        System.out.println("Language: " + car.language);
    }
}
