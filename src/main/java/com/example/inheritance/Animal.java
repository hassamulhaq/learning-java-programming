package com.example.inheritance;

class Animal {
   protected String name;

    public void eat() {
        System.out.println("Eating...");
    }
}

class Wolf extends Animal {
    public void display() {
        System.out.println("Displaying..." + name);
    }
}

class Main {
    public static void main(String[] args) {
        Wolf wolf001 = new Wolf();
        wolf001.name = "Wolf 001";
        System.out.println();
        wolf001.display();
    }
}

