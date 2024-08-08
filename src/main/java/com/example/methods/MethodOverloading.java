package com.example.methods;

public class MethodOverloading {
    private static void display(String a) {
        System.out.println("Arguments: " + a);
    }

    private static void display(String a, String b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    public static void main(String[] args) {
        display("Hello");
        display("Hello", "World");
    }
}
