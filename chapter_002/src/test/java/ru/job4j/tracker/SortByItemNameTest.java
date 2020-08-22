package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;

import java.util.Comparator;

public class SortByItemNameTest {
    @Test
    public void whenFirstAndSecondSort() {
        Comparator<Item> compare = new SortByItemName();
        int rsl = compare.compare(
                new Item("First"),
                new Item("Second")
        );
        assertThat(rsl, lessThan(0));
    }
}
