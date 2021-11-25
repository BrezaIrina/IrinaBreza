package com.irinabreza.hillel.Lesson3;
import java.util.Arrays;

public class Lesson5 {

    public static void main(String[] args) {
        double[] array = new double[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = getSomeValue();
        }
        for (double arrayElement : array) {
            System.out.println(arrayElement);
        }
    }

    public static int getSomeValue() {
        return 1;
    }
}

