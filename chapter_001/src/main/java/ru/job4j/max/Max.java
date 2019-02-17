package ru.job4j.max;

/**
 * @author Anton Frolov (mailto:spitfires111@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Max {

    public boolean max(int first, int second, int third) {
        return first > second || first > third || second > third || third > first;
    }

}

