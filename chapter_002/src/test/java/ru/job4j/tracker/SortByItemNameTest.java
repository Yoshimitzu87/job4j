package ru.job4j.tracker;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

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
