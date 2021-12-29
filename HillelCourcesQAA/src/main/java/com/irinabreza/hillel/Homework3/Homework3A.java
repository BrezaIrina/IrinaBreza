package com.irinabreza.hillel.Homework3;
import java.util.Scanner;
import java.util.HashMap;
import java.lang.Math;

public class Homework3A {

    public static void main(String[] args) {
        selectProgram();
    }

    public  static void selectProgram() {

        // Created string variables that match our programs
        String newLine = System.getProperty("line.separator");
        String menuStr = newLine + newLine +  "--- Menu ---" + newLine;
        String checkOddEvenStr = "1 Check Odd Even";
        String printMonthInWordStr = "2 Print Month In Word if...else if";
        String printMonthInWordSwitchStr = "3 Print Month In Word switch-case";
        String absStr = "4 Compare magnitude";
        String triangleStr = "5 Isosceles triangle";
        String exit = "0 Exit";

        // Print out all programs
        System.out.println(
                menuStr + checkOddEvenStr +  newLine + printMonthInWordStr +
                        newLine + printMonthInWordSwitchStr + newLine +
                        absStr + newLine + triangleStr + newLine + exit
        );

        // Ask user about program to execute
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();

        // Switch over existing variants
        switch (number) {
            case 1:
                checkOddEven();
                break;
            case 2:
                printMonthInWord();
                break;
            case 3:
                printMonthInWordSwitch();
                break;
            case 4:
                abs();
                break;
            case 5:
                triangle();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Please, provide valid value" + newLine);
                selectProgram();
        }
    }

    public static void checkOddEven() {
        System.out.println("Please, provide number");
        Scanner inputNumberScanner = new Scanner(System.in);
        int number = inputNumberScanner.nextInt();
        boolean isEvenNumber = number % 2 == 0;
        String numberDescription = isEvenNumber ? "Even Number" : "Odd number";
        System.out.println(numberDescription);
        System.out.println("BYE");
        selectProgram();
    }

    public static void printMonthInWord() {
        System.out.println("Please, provide month");
        Scanner inputMonthScanner = new Scanner(System.in);
        int month = inputMonthScanner.nextInt();
        if (month == 1) {
            System.out.println("JAN");
        } else if (month == 2) {
            System.out.println("FEB");
        } else if (month == 3) {
            System.out.println("MAR");
        } else if (month == 4) {
            System.out.println("APR");
        } else if (month == 5) {
            System.out.println("MAY");
        } else if (month == 6) {
            System.out.println("JUN");
        } else if (month == 7) {
            System.out.println("JUL");
        } else if (month == 8) {
            System.out.println("AUG");
        } else if (month == 9) {
            System.out.println("SEP");
        } else if (month == 10) {
            System.out.println("OCT");
        } else if (month == 11) {
            System.out.println("NOV");
        } else if (month == 12) {
            System.out.println("DEC");
        } else {
            System.out.println("Not a valid month");
        }
        selectProgram();
    }

    public static void printMonthInWordSwitch() {
        System.out.println("Please, provide month");
        Scanner inputMonthScanner = new Scanner(System.in);
        int month = inputMonthScanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("JAN");
                break;
            case 2:
                System.out.println("FEB");
                break;
            case 3:
                System.out.println("MAR");
                break;
            case 4:
                System.out.println("APR");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUN");
                break;
            case 7:
                System.out.println("JUL");
                break;
            case 8:
                System.out.println("AUG");
                break;
            case 9:
                System.out.println("SEP");
                break;
            case 10:
                System.out.println("OCT");
                break;
            case 11:
                System.out.println("NOV");
                break;
            case 12:
                System.out.println("DEC");
                break;
            default:
                System.out.println("Not a valid month");
        }
        selectProgram();
    }

    public static void printMonthInWordMap() {
        HashMap<Integer, String> months = new HashMap<Integer, String>();
        months.put(1, "JAN");
        months.put(2, "FEB");
        months.put(3, "MAR");

        System.out.println("Please, provide month");
        Scanner inputMonthScanner = new Scanner(System.in);
        int month = inputMonthScanner.nextInt();

        String currentMonth = months.get(month);
        boolean isValidMonth = currentMonth != null;
        String monthDescription = isValidMonth ? currentMonth : "Not a valid month";
        System.out.println(monthDescription);
        selectProgram();
    }

    public static void abs() {
        System.out.println("Please, provide first number");
        Scanner inputNumberScanner = new Scanner(System.in);
        int number1 = inputNumberScanner.nextInt();
        System.out.println("Please, provide second number");
        int number2 = inputNumberScanner.nextInt();
        int absNumber1 = Math.abs(number1);
        int absNumber2 = Math.abs(number2);
        boolean isFirstNumberBigger = absNumber1 > absNumber2;
        int resultNumber = isFirstNumberBigger ? number1 : number2;
        System.out.println(resultNumber);
        selectProgram();
    }

    public static void triangle() {
        System.out.println("Please, provide A side length");
        Scanner inputNumberScanner = new Scanner(System.in);
        int sideA = inputNumberScanner.nextInt();
        System.out.println("Please, provide B side length");
        int sideB = inputNumberScanner.nextInt();
        System.out.println("Please, provide C side length");
        int sideC = inputNumberScanner.nextInt();
        if (sideA == sideB && sideB == sideC) {
            System.out.println("all sides are equal");
        } else {
            System.out.println("sides are not equal");
        }
        selectProgram();
    }
}
