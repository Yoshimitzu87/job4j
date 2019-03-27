package ru.job4j.array;

import java.util.Arrays;

/**
 * ArrayDuplicate
 *
 * @author Anton Frolov
 * @version $Id$
 * @since 0.1 (26.03.2019)
 */
public class ArrayDuplicate {

    public String[] remove(String[] array) {
        int l = array.length; //присваиваем переменной l длинну массива array
        for (int i = 0; i < l; i++)
            for (int j = i + 1; j < l - i; i++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[i - 1];
                    l--;
                    j--;
                }

            }


        return Arrays.copyOf(array, l);
    }
}



