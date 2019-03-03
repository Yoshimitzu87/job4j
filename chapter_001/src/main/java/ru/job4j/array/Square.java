package ru.job4j.array;
/**
 * Square
 *
 * @author Anton Frolov
 * @version $Id$
 * @since 0.1 (03.03.2019)
 */
public class Square {
    /**
     * calculate - возвращает массив через цикл элементами от 1 до bound возведенными в квадрат
     *
     * @param bound - размер массива
     * @return - возвращаемый массив
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(i + 1, 2);
        }
        return rst;
    }
}