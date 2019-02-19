package ru.job4j.loop;

/**
 * Factorial.
 *
 * @author Anton Frolov (spitfires111@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Factorial {
    public int calc(int n) {
        int index = 1;
        for (int i = 1; i <= n; i++) {
            index *= i;
        }
        return index;
    }
}




