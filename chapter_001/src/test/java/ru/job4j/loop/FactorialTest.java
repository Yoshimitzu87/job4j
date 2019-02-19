package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial calc = new Factorial();
        int n = calc.calc(5);
        assertThat(n, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial calc = new Factorial();
        int n = calc.calc(0);
        assertThat(n, is(1));
    }
}