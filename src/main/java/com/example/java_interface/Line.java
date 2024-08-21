package com.example.java_interface;

interface Line {
    void draw();
}

interface Polygon {
    void sketch();
    void draw(String s);
}

class Hello implements Line, Polygon {
    @Override
    public void draw() {

    }

    public void sketch() {
        System.out.println("Hello->sketch()");
    }

    public void draw(String s) {
        System.out.println("Hello->draw(String): " + s);
    }
}

class Main3 {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.sketch();
        hello.draw("909");
    }
}