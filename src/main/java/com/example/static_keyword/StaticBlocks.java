package com.example.static_keyword;

public class StaticBlocks {
    static int a = 55;

    static {
        int b = 3;
        int c = 2;

        System.out.println("static block: b: " + b);

        int z = b * c;
        System.out.println("static block: z: " + z);
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}
