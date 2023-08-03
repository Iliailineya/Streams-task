package org.example;

import net.datafaker.Faker;

import java.util.*;

public class Filling {
    public static List<String> generateRandomNames(int count) {
        Faker faker = new Faker();
        Set<String> names = new TreeSet<>();

        for (int i = 0; i < count; i++) {
            String name = faker.name().firstName();
            names.add(name);
        }
        return new ArrayList<>(names);
    }

    public static Map<String, Double> productsFromMother() {
        Map<String, Double> products = new HashMap<>();
        products.put("Крупа", 2.10);
        products.put("Хлеб", 1.80);
        products.put("Горчица", 3.00);
        products.put("Колбаса", 1.50);
        products.put("Сыр", 2.50);
        products.put("Гвозди", 1.90);
        return products;
    }

    public static Map<String, Double> temperaturesPerDay() {
        Map<String, Double> temperatures = new HashMap<>();
        temperatures.put("Monday", 12.4);
        temperatures.put("Tuesday", 15.0);
        temperatures.put("Wednesday", 9.9);
        temperatures.put("Thursday", 11.6);
        temperatures.put("Friday", 14.0);
        temperatures.put("Saturday", 8.3);
        temperatures.put("Sunday", 13.5);
        return temperatures;
    }
}
