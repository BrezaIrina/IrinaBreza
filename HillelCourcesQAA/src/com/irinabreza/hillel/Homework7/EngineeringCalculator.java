package com.irinabreza.hillel.Homework7;

public class EngineeringCalculator extends BasicCalculator {

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        return a / b;
    }

    //Override + Overload
    public int addition(int a, int b, int c) {
        return a + b + c;
    }

    public int toQube(int number) {
        int square = super.toSquare(number);
        return (number * square);
    }

    @Override
    public int toSquare(int number) {
        System.out.println("Will call super.toSquare");
        return super.toSquare(number);
    }
}