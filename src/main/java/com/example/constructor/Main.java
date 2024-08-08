package com.example.constructor;

public class Main {
    private String name;

    Main() {
        System.out.println("Constructor called!");
        name = "JAVA";
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("system.out(): " + main.name);
    }
}
