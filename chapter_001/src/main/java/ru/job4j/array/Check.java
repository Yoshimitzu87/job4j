package ru.job4j.array;
/**
 * Check
 *
 * @author Anton Frolov
 * @version $Id$
 * @since 0.1 (20.03.2019)
 */
public class Check {

    public boolean mono(boolean[] data) {
        boolean result = true; //присваиваем резалту тру
        for (int i = 0; i < data.length; i++) {
            if (data[0] != data[i]) // пока i меньше длинны массива сравниваем первый элемент и последующий
                result = false; // если элементы не равны присваиваем резалту фолс
            break;
        }
        return result;
    }
}
