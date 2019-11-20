package ru.job4j.array;

import java.util.Arrays;

/**
 * сортировка
 *
 * @author Anton Frolov
 * @version $Id$
 * @since 0.1 (25.03.2019)
 */


public class Merge {
    public static void main(String[] args) {
        int[] a = {3, 1, 5, 7, 9, 11, 13, 15, 17};
        int[] b = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] result = new int[a.length + b.length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        for (int barrier = result.length - 1; barrier >= 0; barrier--) {
            for (int i = 0; i < result.length - 1; i++) {
                if (result[i] > result[i + 1]) {
                    int tmp = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = tmp;
                }
            }
            }
            System.out.println(Arrays.toString(result));
    }
}