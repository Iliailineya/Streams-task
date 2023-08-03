package org.example;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Task 1
        List<String> names = Filling.generateRandomNames(100);
        Util.printNumberedElements(Util.filterForLetter(names, 'A'));
        System.out.println();

//        Task 2
        Map<String, Double> products = Filling.productsFromMother();
        Util.printNumberedMap(Util.selectedItems(products, 0.0, 2.00));
        System.out.println();

//        Task 3
        Map<String, Double> temperatures = Filling.temperaturesPerDay();
        Util.printNumberedMap(Util.selectedItems(temperatures, 10, 13));
    }




}
