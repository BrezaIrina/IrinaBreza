package com.irinabreza.hillel.lesson15;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lesson15 {
    public static void main(String[] args) {
        Iface iface = () -> System.out.println("anon method is called");

//        Iface iface1 = (param1, param2) -> {
//            //some code
//        };

        Predicate<String> predicate = str -> str.contains("test");

//        predicate.test("java testing");
//        predicate.test("java automation");

        Consumer<String> consumer = str -> System.out.println(str);

        consumer.accept("some test");

        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            int result = random.nextInt(100);
            return result;
        };

        Function<Integer, String> function = num -> String.format("received value: %d", num+10);

        function.apply(10);

        int i = supplier.get();

        iface.doSometh();
    }
}
