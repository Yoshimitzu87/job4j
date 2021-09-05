package ru.job4j.collecion;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task n : list) {
            numbers.add(n.getNumber());

        }
        return numbers;
    }
}