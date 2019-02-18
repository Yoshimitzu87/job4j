package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter add = new Counter();
        int start = 1;
        int finish =10;
        int i = add.add(start, finish);
        assertThat(i ,is(30));
    }
}