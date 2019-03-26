package ru.job4j.array;
/**
 * MatrixCheck
 * @author Anton Frolov
 * @version $Id$
 * @since 0.1 (26.03.2019)
 */

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++)
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] != data[i+1][j+1] || data[i][j+2] != data[i+1][j+1])
                {result = false;

                    break;}

            }
        return result;
    }
}