package com.example.java_instanceof;

public class Animal {
    public static String name = "Animal";
}

class Main2 {
    public static void main(String[] args) {

        Animal a = new Animal();
        boolean isA = a instanceof Animal;

        System.out.println("e " + isA);
    }
}
