package com.irinabreza.hillel.Homework7;

public class BrokenCalculator extends BasicCalculator {
    @Override
    public int addition(int a, int b) {
        return a + b / 2;
    }

    @Override
    public int subtraction(int a, int b) {
        return 20000;
    }

    @Override
    public int multiplication(int a, int b) {
        return 0;
    }

    @Override
    public int division(int a, int b) {
        return a / b - 25;
    }
}
