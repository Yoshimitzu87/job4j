package ru.job4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Gol {

    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);
        System.out.println("11111");
    }
}