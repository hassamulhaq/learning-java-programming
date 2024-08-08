package com.example.java_strings;

public class Main {
    static String cc = "Hello my \"user\" here!";

    static {
        System.out.println("--->: " + cc);
        System.out.println("endwith: " + cc.endsWith("!"));
    }

    public static void main(String[] args) {
        String a = "A";
        String b = "B";
        String z = "zZZzz";

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("z: " + z);

        System.out.println("z length:" + z.length());

        System.out.println("concat a-b: " + a.concat(b));

        System.out.println("check equals: " + a.equals(b));
    }
}
