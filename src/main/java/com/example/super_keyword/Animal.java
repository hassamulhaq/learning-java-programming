package com.example.super_keyword;

public class Animal {
    String type = "animal";
    int age = 0;

    public void display() {
        System.out.println("I am an " + type);
    }
}

class Dog extends Animal {
    @Override
    public void display() {
        System.out.println("I am a big dog");
        super.type = "super animal!";
        super.display();
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
        System.out.println();
    }
}
