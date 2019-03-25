package ru.job4j.array;
/**
 * BubbleSortTest
 *
 * @author Anton Frolov
 * @version $Id$
 * @since 0.1 (25.03.2019)
 */


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubble = new BubbleSort();
        int[] array = new int[]{9, 4, 2, 3, 1, 7, 8, 0, 5, 6};
        int[] result = bubble.sort(array);
        int[] sort = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(sort));
        //напишите здесь тест, проверяющий сортировку массива из 10 элементов методом пузырька, например {1, 5, 4, 2, 3, 1, 7, 8, 0, 5}.
    }
}