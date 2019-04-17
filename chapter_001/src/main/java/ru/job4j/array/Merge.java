package ru.job4j.array;

import java.util.Arrays;
import sun.reflect.generics.tree.ArrayTypeSignature;

import java.util.concurrent.atomic.AtomicStampedReference;

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
        for (int i = 0; i < result.length - 1; i++) {
                if (result[i] > result[i + 1]) {
                    int tmp = result[i];
                    result[i] = result[i + 1];
                    result[i + 1] = tmp;

                }

            }
            System.out.println(Arrays.toString(result));

        }

    }
