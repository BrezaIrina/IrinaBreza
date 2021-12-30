package com.irinabreza.hillel.lesson17;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTask {

    // Add 'N' elements, 'm'
    //
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        int lengthList = 1000000;
        int countElements = 3000;

        for(int i = 0; i < lengthList; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long timeStart = System.currentTimeMillis();
        for(int i = 0; i < countElements; i++) {
            arrayList.get((int) (Math.random() * (lengthList-1)));
        }
        System.out.println("ArrayList: ");
        System.out.println(System.currentTimeMillis() - timeStart);

        timeStart = System.currentTimeMillis();
        for(int i = 0; i < countElements; i++) {
            linkedList.get((int) (Math.random() * (lengthList-1)));
        }
        System.out.println("LinkedList: ");
        System.out.println(System.currentTimeMillis() - timeStart);
    }
    }

