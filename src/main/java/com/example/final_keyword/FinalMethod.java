package com.example.final_keyword;

public class FinalMethod {

    public final void display() {
        System.out.println("display()");
    }
}

class Main extends FinalMethod {

    /**
     * java: display() in com.example.final_keyword.Main cannot override display() in com.example.final_keyword.FinalMethod
     * overridden method is final
     */
    /*public void display() {
        System.out.println("ex: display()");
    }*/

    public static void main(String[] args) {

    }
}
