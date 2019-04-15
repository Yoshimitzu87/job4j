package ru.job4j.array;
/**
 * ArrayDuplicateTest
 *
 * @author Anton Frolov
 * @version $Id$
 * @since 0.1 (26.03.2019)
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate dup = new ArrayDuplicate();
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир", "Мир"};
        String[] result = dup.remove(input);
        String[] expect = {"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));
    }

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicates() {
        ArrayDuplicate dup = new ArrayDuplicate();
        String[] input = {"audi", "bmw", "mercedes", "volkswagen", "bmw", "bmw"};
        String[] result = dup.remove(input);
        String[] expect = {"audi", "bmw", "mercedes", "volkswagen"};
        assertThat(result, is(expect));
    }

}