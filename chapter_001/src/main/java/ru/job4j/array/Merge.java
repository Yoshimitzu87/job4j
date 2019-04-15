package ru.job4j.array;

/**
 * сортировка
 *
 * @author Anton Frolov
 * @version $Id$
 * @since 0.1 (25.03.2019)
 */





public class Merge {
    public static void main(String[] args) {

        int[] a = {1, 3};
        int[] b = {2, 4};
        int length = a.length + b.length;
        int[] result = new int[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        for (int i = 0; i < result.length - 1; i--) {
            for (int j = 0; j < i; j++) {

                if (result[j] > result[j + 1]) {
                    int tmp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = tmp;
                }
            }
        }
    }
}