package com.irinabreza.hillel.lesson16;

import com.github.javafaker.Faker;

public class FakeDataEx {
    public static void main(String[] args) {
        Faker faker = new Faker();
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %s%n", faker.name().firstName(), faker.name().lastName());
        }
    }
}
