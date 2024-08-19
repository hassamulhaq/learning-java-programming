package com.example.method_overriding;

class Animal {
    protected String name;
    protected int age;

    void setAge() {
        this.age = 14;
    }
}

class Wolf extends Animal {
    void eat() {
        System.out.println("Wolf eat.");
    }

    @Override
    void setAge() {
        //super.setAge();
        this.age = 23;
    }

    int getAge() {
        return this.age;
    }
}

class Main {
    public static void main(String[] args) {
        Wolf wolf002 = new Wolf();
        wolf002.setAge();
        System.out.println("wolf002: direct super class member called: " + wolf002.name);
        System.out.println("wolf002: " + wolf002.getAge());

        Animal ani = new Animal();
        ani.setAge();
        System.out.println("ani: " + ani.age);
    }
}