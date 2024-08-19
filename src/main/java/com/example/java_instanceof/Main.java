package com.example.java_instanceof;

public class Main {

    public static void main(String[] args) {
        String c_c = "loop";

        boolean cc = c_c instanceof String;
        System.out.println(cc);

        Main odoo = new Main();
        boolean isOddoMain = odoo instanceof Main;
        System.out.println("odoo: " + isOddoMain);
    }
}
