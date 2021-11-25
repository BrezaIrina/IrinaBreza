package com.irinabreza.hillel.Homework2;
import java.util.Scanner;

public class Homework2B {

    public static void main(String[] args) {
        System.out.println("Please, input length of Katet #1");
        Scanner inputScanner = new Scanner(System.in);
        double firstKatetLength = inputScanner.nextDouble();
        System.out.println(firstKatetLength);
        System.out.println("Please, input length of Katet #2");
        double secondKatetLength = inputScanner.nextDouble();
        System.out.println(secondKatetLength);
        double area = 0.5 * firstKatetLength * secondKatetLength;
        System.out.println(area);
    }
}
