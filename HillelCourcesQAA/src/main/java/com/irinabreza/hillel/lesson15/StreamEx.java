package com.irinabreza.hillel.lesson15;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("10");
        list.add("-2");
        list.add("4");
        list.add("0");
        list.add("20");

        List<Integer> newList = new LinkedList<>();
        for(String s : list) {
            int value = Integer.parseInt(s);
            if (value > 0) {
                newList.add(value + 10);
            }
        }

        int sum = 0;
        for (int n : newList) {
            sum +=n;
        }

       // System.out.println(sum);

      Optional<Integer> opt  = list.stream().map(Integer::parseInt).filter(val -> val > 1000)
                .map(val -> val + 10).findFirst();

        if(opt.isPresent()) {
            int i = opt.get();
        }
    }
}
