package com.example.java_interface;

public class StaticInterface {

}

interface Polygon2 {
    static void testing() {
        System.out.println("Inside testing method");
    }
    void hello();
}

class Main5 implements Polygon2 {
    public static void main(String[] args) {
        System.out.println("Inside main method");
    }

    public void hello() {
        System.out.println("hello()");
    }
}

