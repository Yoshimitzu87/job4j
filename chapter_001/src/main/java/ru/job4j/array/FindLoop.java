package ru.job4j.array;
/**
 * FindLoop
 *
 * @author Anton Frolov
 * @version $Id$
 * @since 0.1 (17.03.2019)
 */
public class FindLoop {
    public int indexOf(int[] data, int i) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++)  {
            if (data[index] == i) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}