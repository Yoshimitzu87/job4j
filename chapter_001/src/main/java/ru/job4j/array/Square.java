package ru.job4j.array;
/**
 * @author Anton Frolov (mailto:spitfires111@gmail.com)
 * @version 1.0
 * @since 02.003.2019
 */


public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= bound; i++) {
            rst[bound] = (int) Math.pow(i, 2);
            return rst;
        }
    }
}