package ru.job4j.max;

/**
 * @author Anton Frolov (mailto:spitfires111@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Max {

    public int max(int first, int second, int third) {
        int maxim = second > first ? second : first;
        int maxima = third > maxim ? third : maxim;
        return maxima;

    }
}