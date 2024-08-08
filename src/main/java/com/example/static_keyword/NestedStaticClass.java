package com.example.static_keyword;

public class NestedStaticClass {
    static class MyNestedClass {
        private int a = 11;

        static {
            System.out.println("MyNestedClass static block");
        }
        public static void main(String[] args) {
            System.out.println("a");
        }
    }

    public static void main(String[] args) {
        System.out.println("main");

        MyNestedClass mnc = new MyNestedClass();
        mnc.a = 1122;
        System.out.println("mnc: " + mnc);
    }
}
