package com.irinabreza.hillel.Homework9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int arrayListSize = 100;

        List<Integer> allNumbers = new ArrayList<Integer>(arrayListSize);
        for (int index = 0; index < arrayListSize; index++) {
            Integer randomNumber = getRandomNumber(500);
            allNumbers.add(randomNumber);
        }
        System.out.println("List of all random numbers");
        System.out.println(allNumbers);
        List<Integer> other = new LinkedList<>();
        List<Integer> dividesOn2 = new LinkedList<>();
        List<Integer> dividesOn3 = new LinkedList<>();

        for (Integer element : allNumbers) {
            if (element % 2 == 0 && element % 3 == 0) {
                dividesOn2.add(element);
                dividesOn3.add(element);
            } else if (element % 2 == 0) {
                dividesOn2.add(element);
            } else if (element % 3 == 0) {
                dividesOn3.add(element);
            } else {
                other.add(element);
            }
        }
        System.out.println("List of numbers devides on 2");
        System.out.println(dividesOn2);
        System.out.println("List of numbers devides on 3");
        System.out.println(dividesOn3);
        System.out.println("List of other numbers");
        System.out.println(other);
    }

    public static Integer getRandomNumber(Integer upperLimit) {
        Random numberGenerator = new Random();
        return numberGenerator.nextInt(upperLimit);
    }
}
