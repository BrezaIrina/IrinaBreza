package com.irinabreza.hillel.lesson17;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        System.out.println("Input number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum +=i;
            System.out.println(i);
        }
        System.out.println("Sum = " + sum);
    }
}
