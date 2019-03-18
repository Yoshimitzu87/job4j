package ru.job4j.array;

/**
 * Turn
 *
 * @author Anton Frolov
 * @version $Id$
 * @since 0.1 (17.03.2019)
 */

public class Turn {
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int e = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = e;
        }
        return array;
    }
}