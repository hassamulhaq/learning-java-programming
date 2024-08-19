package com.example.super_keyword;

/**
 * Parameterized Constructor
 */
class Animal2 {
    // default or no-arg constructor
    Animal2() {
        System.out.println("Animal2 constructor");
    }

    // parameterized constructor
    Animal2(String name) {
        System.out.println("Animal2 parameterized constructor :" + name);
    }
}

class Dog2 extends Animal2 {
    Dog2() {
        // calling parameterized constructor of the superclass
        super("Animal2 param...");

        System.out.println("Dog2 constructor");
    }
}

class Main2 {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
    }
}
