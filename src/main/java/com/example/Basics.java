package com.example;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

class Basics {
    int speedLimit = 900;

    public static void main(String[] args) {
        boolean isSpam = false;
        byte range;
        range = 124;
        short temperature;
        temperature = -200;
        int newRange = -4250000;
        double price = 20.3;
        char letter = 'Q';

        System.out.println(temperature);
        System.out.println("Department 909");

        int a = 12, b = 5;
        System.out.println("a+b=" + (a + b));


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double marks = input.nextDouble();

        // ternary operator checks if
        // marks is greater than 40
        String result = (marks > 40) ? "pass" : "fail";
        System.out.println("You " + result + " the exam.");
        input.close();

        int j = 9;
        int sum = 0;
        for (int i = 0; i < j; i++) {
            sum += i;
        }
        System.out.println("Java is fun! " + sum);


        // array
        System.out.println("=====================array");
        int[] numbers = {1, 2, 3, 4};
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("=====================_array");

        System.out.println("=====================while");
        int wi = 5, wc = 7;
        while (wi <= wc) {
            System.out.println(wi);
            wi++;
        }
        System.out.println("=====================_while");

        System.out.println("=====================case");
        String size;
        int sNumber = 2;
        switch (sNumber) {
            case 1:
                size = "small";
                break;
            case 2:
                size = "medium";
                break;
            default:
                size = "unknown";
                break;
        }
        System.out.println(size);
        System.out.println("=====================_case");


        System.out.println("=====================array");
        String[] gg = new String[100];
        int[] ages = {2, 4, 5};
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
            // haha
        }
        System.out.println("=====================_array");
        System.out.println("=====================multidimensional_arrays");
        double[][] matrix = {{1.2, 4.3, 4.0}, {4.1, -1.1}};
        System.out.println(Arrays.deepToString(matrix));

        int[][] jio = new int[22][2];


        int[][] ma = {
                {1,2,3},
                {4,5},
                {7}
        };
        System.out.println(Arrays.deepToString(ma));
        System.out.println("=====================_multidimensional_arrays");

        System.out.println("=====================copy_array");
        String[] ca = {"name", "age"};
        String[] caa = ca;
        for (String no : caa) {
            System.out.println(no);
        }
        System.out.println("=====================_copy_array");
    }

    public static Serializable getDepartment() {
        return "Hi";
    }
}
