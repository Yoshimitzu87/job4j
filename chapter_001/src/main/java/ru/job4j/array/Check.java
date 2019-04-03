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
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
