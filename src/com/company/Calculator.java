package com.company;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int sum() {
        return a + a;
    }

    public int subtraction() {
        return a - b;
    }

    public int multiplication() {
//        int total = 0;
//        for (int i = 0; i < b; i++) {
//            total += a;
//        }
//        return total;
        return a * b;
    }

    public double division() {
        double result;
        result = a / b;
        return result;
    }
}
