package com.irinabreza.hillel.Homework9;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.ArrayList;
import java.util.Set;
import java.util.LinkedHashSet;

public class Task1 {
    public static void main(String[] args) {
        int arrayListSize = 100;

        ArrayList<Integer> intList = new ArrayList<Integer>(arrayListSize);
        for (int index = 0; index < arrayListSize; index++) {
            Integer randomNumber = getRandomNumber(20);
            intList.add(randomNumber);
        }

        Set<Integer> intSet = new LinkedHashSet<Integer>(intList);

        int duplicatesCount = intList.size() - intSet.size();
        System.out.println("Random integer number list");
        System.out.println(intList);
        System.out.println("Set of unique numbers");
        System.out.println(intSet);
        System.out.println("Count of removed duplicates");
        System.out.println(duplicatesCount);

    }
    public static Integer getRandomNumber(Integer upperLimit) {
        Random numberGenerator = new Random();
        return numberGenerator.nextInt(upperLimit);
    }
}
