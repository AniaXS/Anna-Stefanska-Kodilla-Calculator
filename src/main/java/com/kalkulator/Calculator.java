package com.kalkulator;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return y - x;
    }

    public static void main(String[] args) {
        Calculator calculations = new Calculator();

        System.out.println(calculations.add(7736, 276));
        System.out.println(calculations.subtract(77,939466));
    }

}
