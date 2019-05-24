package ru.job4j.max;
/**
 * @author Anton Frolov (mailto:spitfires111@gmail.com)
 * @version $Id$
 * @since 0.1
 */

public class Max {

    public int max(int first, int second) {
        int maxim = second > first ? second : first;
        return maxim;
    }
    public int max(int first, int second, int third){
        int tmp = max(first, second);
        return max(third,tmp);
    }
}