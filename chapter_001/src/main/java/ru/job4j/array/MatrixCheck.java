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
            if (data[i][i] != data[i + 1][i + 1] ||
                data[i][i + 2] != data[i + 1][i + 1] ||
                data[i + 2][i] != data[i + 1][i + 1]) {
                result = false;

                break;
            }
        }
        return result;
    }
}