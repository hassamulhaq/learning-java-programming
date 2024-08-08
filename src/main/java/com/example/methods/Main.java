package com.example.methods;

class Main {
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    double square(double a, double b) {
        return a * b;
    }

    void display1() {
        System.out.println("Method wothout params");
    }

    private static int getSqrt(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;

        Main obj = new Main();
        int result = obj.addNumbers(num1, num2);
        System.out.println("Sum is: " + result);

        Main obj2 = new Main();
        System.out.println("Sum is: " + obj2.square(22, 2));

        obj2.display1();


        System.out.println("lib: Square root of 4 is:: " + Math.sqrt(4));

        System.out.println("==================");

        int y = 10;
        for (int i = 0; i <= y; i++) {
            int res = getSqrt(i);
            System.out.println("Square of " + i + " is: " + res);
        }
    }
}
