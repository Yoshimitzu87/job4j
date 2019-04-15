package ru.job4j.array;

/**
 * BubbleSort
 *
 * @author Anton Frolov
 * @version $Id$
 * @since 0.1 (25.03.2019)
 */

public class BubbleSort {

    public int[] sort(int[] bubble) {
        for (int i = bubble.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (bubble[j] > bubble[j + 1]) {
                    int tmp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = tmp;
                }
            }
        }
        return bubble;
    }
}