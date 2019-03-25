package ru.job4j.array;

/**
 * BubbleSort
 *
 * @author Anton Frolov
 * @version $Id$
 * @since 0.1 (25.03.2019)
 */

public class BubbleSort {
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] > array[i + 1]) {
                int t = array[i];
                array[i] = array[i + 1];
                array[i + 1] = t;
            }
        return array;
    }
}
