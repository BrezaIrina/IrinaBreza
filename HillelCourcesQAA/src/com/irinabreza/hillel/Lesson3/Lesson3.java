package com.irinabreza.hillel.Lesson3;

import javax.sound.midi.Soundbank;

public class Lesson3 {
    public static void main(String[] args) {
//        part1();
//        part2();
        part3();
        }

    public static void part1() {

       //  String str = new String("string value");

String str = "String Value";
str.toLowerCase();

str.charAt(0);
str.contains("val");


//склеїти разом
str = "new" + "value";
str = "new" + 5;

    }

    public static void part2() {
        System.out.println("part2(Before IF");

        if (false) {
            System.out.println("INSIDE IF 1");
        System.out.println("INSIDE IF 2");
    }

        String str = null;

if (str != null && str.contains ("value")) {
    System.out.println("INSIDE IF 1");
}
        System.out.println("INSIDE IF 2");
        System.out.println("After IF");
}

public static boolean checkFlag() {
        return true;
}


    public static void part3() {
        String str = null;

        if (str != null && str.contains ("value")) {
            System.out.println("INSIDE IF 1");
        } else {
            System.out.println("Else");
        }
    }
}
/*

switch (day) {
    case 1:
        }
*/

