package com.irinabreza.hillel.lesson13;
import java.util.*;

public class Lesson13 {
    public static void main(String[] args) {
//        List<String> stringList = new LinkedList<>();
//        stringList.size();
//        stringList.add("s1");
//        stringList.add("s2");
//        stringList.add(1, "s3");
//
//        for (int i = 0; i < stringList.size(); i++) {
//            stringList.get(i);
//        }
//
//        List<String> strList2 = new ArrayList<>();
//        strList2.addAll(stringList);
//
//     Set<String> strList2 = new TreeSet<>();
//     strList2.addAll(stringList);
//
//        System.out.println(stringList);


        List<String> list = new ArrayList<>();
        list.get(0);

        List<Integer> list2 = new ArrayList<>();


        Set<String> set1 = new TreeSet<>(list);

        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(6);
        set.add(2);
        set.add(20);

        for(Integer s : set) {
            System.out.println(s);
        }

        System.out.println(set.size());
    }
}
