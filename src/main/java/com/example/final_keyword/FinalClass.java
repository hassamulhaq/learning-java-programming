package com.example.final_keyword;

final class FinalClass {
    public void display() {
        System.out.println("Hello World");
    }
}

// java: cannot inherit from final com.example.final_keyword.FinalClass
/*
class Main2 extends FinalClass {
    int z = 0;

    public static void main(String[] args) {

    }
}*/
