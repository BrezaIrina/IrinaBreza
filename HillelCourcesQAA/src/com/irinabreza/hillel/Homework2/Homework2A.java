package com.irinabreza.hillel.Homework2;
import java.util.Scanner;

public class Homework2A {

    public static void main(String[] args) {
        System.out.println("Please, enter temperature in Celsius");
        Scanner inputScanner = new Scanner(System.in);
        double temperatureInCelsius = inputScanner.nextDouble();
        double temperatureInKelvin = temperatureInCelsius + 273.16;
        double temperatureInFahrenheit = (9.0 * temperatureInCelsius) / 5.0 + 32.0;
        System.out.printf("Temperature in C: %f, in K - %f, in F - %f", temperatureInCelsius, temperatureInKelvin, temperatureInFahrenheit);
    }
}
