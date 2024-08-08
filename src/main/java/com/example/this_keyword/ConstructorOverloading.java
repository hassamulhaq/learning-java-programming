package com.example.this_keyword;

public class ConstructorOverloading {
    int y, z;

    private ConstructorOverloading(int y, int z) {
        this.y = y;
        this.z = z;
    }

    private ConstructorOverloading(int y) {
        this(y, y);
    }

    private ConstructorOverloading() {
        this(0);
    }

    @Override
    public String toString() {
        return this.y + " + " + this.z;
    }

    public static void main(String[] args) {
        ConstructorOverloading c1 = new ConstructorOverloading(2, 3);
        ConstructorOverloading c2 = new ConstructorOverloading(3);
        ConstructorOverloading c3 = new ConstructorOverloading();

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
    }
}
