package ru.job4j.collecion;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = 0;
        char[] str1 = o1.toCharArray();
        char[] str2 = o2.toCharArray();
        int size = Math.min(str1.length, str2.length);

        for (int i = 0; i < size; i++) {
            int rsl = Character.compare(str1[i], str2[i]);
            if (rsl != 0) {
                result = rsl;
                break;
            }
        }
        if (result == 0) {
            result = Integer.compare(o1.toCharArray().length, o2.toCharArray().length);
        }
        return result;
    }
}
