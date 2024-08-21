package com.example.java_interface;

class DefaultMethodsInterface {
}

interface Polygon1 {
    void getArea();

    default void getSides() {
        System.out.println("Polygon1 Inside getSides");
    }
}

class Square1 implements Polygon1 {
    @Override
    public void getArea() {
        int length = 5;
        int area = length * length;
        System.out.println("The area of the square is " + area);
    }

    // not required to add default interface methods
}

class Rectangle implements Polygon1 {
    public void getArea() {
        int length = 6;
        int breadth = 5;
        int area = length * breadth;
        System.out.println("Area of polygon is " + area);
    }

    @Override
    public void getSides() {
        //Polygon1.super.getSides();
        System.out.println("Polygon1 Inside getSides of Rectangle.");
    }
}

class Main4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea();
        r.getSides();

        Square1 s = new Square1();
        s.getArea();
        s.getSides();
    }
}
