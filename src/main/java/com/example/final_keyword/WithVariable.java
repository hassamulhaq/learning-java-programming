package com.example.final_keyword;

public class WithVariable {
    public static void main(String[] args) {
        final int z = 100;
        //z = 101; // java: cannot assign a value to final variable z

        System.out.println("Hello World: " + z);
    }
}
