package ru.job4j.collecion;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String a : origin) {
            check.add(a);
        }
        for (String a : text) {
            if (!check.contains(a)) {
                rsl = false;
                break;
            }

        }

        return rsl;
    }
}