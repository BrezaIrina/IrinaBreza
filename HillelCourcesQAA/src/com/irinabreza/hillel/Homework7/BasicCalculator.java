package com.irinabreza.hillel.Homework7;

public abstract class BasicCalculator {

    //Override
    public abstract int addition(int a, int b);

    public abstract int subtraction(int a, int b);

    public abstract int multiplication(int a, int b);

    public abstract int division(int a, int b);

    public int toSquare (int a) {
        return a * a;
    }

    public static void main(String[] args) {
        int a = 80;
        int b = 4;
        int c = 6;

        EngineeringCalculator engineeringCalculator = new EngineeringCalculator();
        BrokenCalculator brokenCalculator = new BrokenCalculator();

        BasicCalculator[] allCalculators = {engineeringCalculator, brokenCalculator};
        BasicCalculator.overrideDemo(allCalculators, a, b); // виклик статичної фун=ї на типі
        BasicCalculator.overloadDemo(engineeringCalculator, a, b, c);

    }

    public static void overloadDemo(EngineeringCalculator calculator, int a, int b, int c) //декларація фун-ї
    {
        System.out.println(" ");
        System.out.println("Results Overload");
        System.out.println("First number " + a + ", Second number " + b + ", Third number " + c);

        int twoNumbersAdditionResult = calculator.addition(a, b); //виклик  фун=ї на екземплярі класу
        System.out.println("Addition with two numbers" + " " + twoNumbersAdditionResult);

        int threeNumbersAdditionResult = calculator.addition(a, b, c);
        System.out.println("Overloaded addition with three numbers" + " " + threeNumbersAdditionResult);
    }


    public static void overrideDemo(BasicCalculator[] calculators, int a, int b) {
        System.out.println("Results Override");
        System.out.println("First number " + a + ", Second number " + b);

        for(BasicCalculator currentCalculator : calculators) {

            int addition = currentCalculator.addition(a, b);
            System.out.println("");
            System.out.println(currentCalculator.getClass());
            System.out.println("addition" + " " + addition);

            int subtraction = currentCalculator.subtraction(a, b);
            System.out.println("subtraction" + " " + subtraction);

            int multiplication = currentCalculator.multiplication(a, b);
            System.out.println("multiplication" + " " + multiplication);

            int division = currentCalculator.division(a, b);
            System.out.println("division" + " " + division);
        }
    }
}