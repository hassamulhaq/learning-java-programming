package com.example.static_keyword;

/**
 * In Java, if we want to access class members, we must first create an instance of the class.
 * But there will be situations where we want to access class members without creating any variables.
 */

public class Main {
    static int multiply(int a, int b) {
        System.out.println("static: multiply: " + a * b);
        return a * b;
    }

    int add(int a, int b) {
        System.out.println("add: " + a + b);
        return a + b;
    }

    public static void main(String[] args) {
        Main mm = new Main();
        mm.add(1, 2);

        Main.multiply(2, 4);
    }
}
