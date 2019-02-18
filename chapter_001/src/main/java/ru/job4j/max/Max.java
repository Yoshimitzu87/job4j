package ru.job4j.max;

/**
 * @author Anton Frolov (mailto:spitfires111@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Max {

    public int max(int first, int second) {
        return this.max(first, second);

    }

    public int max(int first, int second, int third) {
        return this.max(max(first, second), third);
    }
}