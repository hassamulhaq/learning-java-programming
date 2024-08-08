package com.example.constructor;

public class Animal {
    private String name = "animal";

    Animal() {
        System.out.println("Animal constructor");
        name = "lobster";
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println("Animal name: " + animal.name);
    }
}
