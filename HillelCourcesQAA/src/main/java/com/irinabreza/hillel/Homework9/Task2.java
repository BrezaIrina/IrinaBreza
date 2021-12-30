package com.irinabreza.hillel.Homework9;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Task2 {

    public static void main(String[] args) {
        Map<String, Integer> purchasingList = new LinkedHashMap<>();
        purchasingList.put("milk", 2);
        purchasingList.put("brad", 1);
        purchasingList.put("apple", 8);
        purchasingList.put("egg", 30);
        purchasingList.put("juice", 3);

        AtomicInteger totalQuantity = new AtomicInteger(0);
        purchasingList.forEach((key, value) -> totalQuantity.addAndGet(value));
        System.out.println(totalQuantity);
    }
}
