package ru.job4j.array;

/**
 * MatrixCheck
 *
 * @author Anton Frolov
 * @version $Id$
 * @since 0.1 (26.03.2019)
 */

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {

            if (data[0][0] != data[i][i]) {

                result = false;

                break;

            }

            if (data[0][data.length - 1] != data[i][data.length - 1 - i]) {

                result = false;

                break;

            }
        }
        return result;
    }
}