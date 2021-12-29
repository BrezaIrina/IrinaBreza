package com.irinabreza.hillel.Homework2;
import java.util.Scanner;

public class Homework2C {

    public static void main(String[] args) {
        System.out.println("Please, enter radius");
        Scanner inputScanner = new Scanner(System.in);
        double radius = inputScanner.nextDouble();
        double area = Math.PI * Math.pow (radius, 2);
        System.out.println(area);
    }
}
