package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;


public class PointTest {
    @Test
    public void distanceTo() {
        Point a = new Point(0, 1);
        Point b = new Point(3, 5);
        assertThat(a.distanceTo(b), closeTo(5.0, 0.01));

    }
}

