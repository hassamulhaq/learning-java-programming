package com.example.abstract_class_and_methods;

abstract class Language {
    abstract void speak();

    void hello() {
        System.out.println("Hello from abstract.");
    }

    String display() {
        return "display from abstract.";
    }
}

class Main extends Language {
    @Override
    void speak() {
        System.out.println("speak from main.");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.hello();
        obj.speak();
        String ufc = obj.display();
        System.out.println(ufc);
    }
}
