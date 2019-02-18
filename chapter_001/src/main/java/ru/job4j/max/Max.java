package ru.job4j.max;

/**
 * @author Anton Frolov (mailto:spitfires111@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Max {
    /**
     *
     * @param first
     * @param second
     * @return
     */
    public int max(int first, int second) {
        return first > second : first ? second;
    }

    /**
     *
     * @param first
     * @param second
     * @param third
     * @return
     */
    public int max(int first, int second, int third) {
        return this.max(max(first, second), third);
    }
}