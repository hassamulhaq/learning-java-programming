package com.example.inheritance_super_keyword;

/**
 * Animal is our super class
 */
class Animal {
    protected String name;
    protected int age;

    public void eat() {
        System.out.println("I can eat.");
    }
}

/**
 * Dog is a sub class
 */
class Dog extends Animal {
    @Override
    public void eat() {
        // call method of superclass use `super.`
        super.eat();

        System.out.println("I can eat to...");
    }

    // new method
    public void bark() {
        System.out.println("I can bark.");
    }
}

class Main {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
    }
}
