package org.example;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Util {
    public static List<String> filterForLetter(List<String> names, char firstLetter) {
        return names.stream()
                .filter(name -> name.charAt(0) == firstLetter)
                .collect(Collectors.toList());
    }

    public static <T> void printNumberedElements(Iterable<T> elements) {
        AtomicInteger count = new AtomicInteger(1);
        elements.forEach(item -> System.out.println(count.getAndIncrement() + ") " + item));

    }

    public static <K, V> void printNumberedMap(Map<K, V> map) {
        AtomicInteger count = new AtomicInteger(1);
        map.forEach((key, value) -> System.out.println(count.getAndIncrement()
                + ") " + key + " - " + value));
    }

    public static Map<String, Double> selectedItems(Map<String, Double> products, double min, double max) {
        return products.entrySet().stream()
                .filter(entry -> entry.getValue() >= min && entry.getValue() <= max)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
