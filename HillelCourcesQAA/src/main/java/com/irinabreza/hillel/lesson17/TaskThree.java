package com.irinabreza.hillel.lesson17;
import java.util.Scanner;

public class TaskThree {
    // try 5
    // true - "TRUE
    // i don't know - "Answer - ..."
    // ... - "Try yet"

    public static void main(String[] args) {
        System.out.println("Зимою та літом завжди зелена ?");
        Scanner answerInput = new Scanner(System.in);
        String answer;
        boolean stop;


        stop = false;
        for (int i = 1; i <= 5; i++) {


            if (stop == false) {
                answer = answerInput.next();
                switch (answer) {
                    case ("Yalunka"):
                        System.out.println("Great!");
                        stop = true;
                        break;
                    case ("NO"):
                        System.out.println("Answer - Yalunka");
                        stop = true;
                        break;
                    default:
                        System.out.println("Try yet");
                }
            }
        }
    }
}
