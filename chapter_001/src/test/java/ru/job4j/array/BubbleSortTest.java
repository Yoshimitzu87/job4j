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
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
        bubbleSort.sort(array);
        int[] expect = new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(array, is(expect));
    }
}