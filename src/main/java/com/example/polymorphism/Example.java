package com.example.polymorphism;

/**
 * Polymorphism allows us to create consistent code. In the previous example,
 * we can also create different methods: renderSquare() and renderCircle() to render Square and Circle, respectively.
 * This will work perfectly. However, for every shape, we need to create different methods.
 * It will make our code inconsistent.
 */

class Polygon {
    /**
     * Hence, the render() method behaves differently in different classes.
     * Or, we can say render() is polymorphic
     */
    void render() {
        System.out.println("Rendering Polygon...");
    }
}

class Square extends Polygon {
    void render() {
        System.out.println("Rendering Square...");
    }
}

class Circle extends Polygon {
    public void render() {
        System.out.println("Rendering Circle...");
    }
}

class Example {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.render();

        Circle c = new Circle();
        c.render();
    }
}
