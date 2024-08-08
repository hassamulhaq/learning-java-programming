package com.example.this_keyword;

public class PassingThisAsArgument {
    int x;
    int y;

    PassingThisAsArgument(int x, int y) {
        this.x = x;
        this.y = y;

        System.out.println("Before passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);

        add(this);

        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
    }

    void add(PassingThisAsArgument ptaa) {
        ptaa.x += 2;
        ptaa.y += 2;
    }
}

class Main {
    public static void main(String[] args) {
        PassingThisAsArgument ptaa = new PassingThisAsArgument(3, 4);
    }
}
