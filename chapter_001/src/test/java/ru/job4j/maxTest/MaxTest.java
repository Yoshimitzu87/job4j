package ru.job4j.maxTest;
import org.junit.Test;
import ru.job4j.max.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenFirstLessSecondLessThird() {
        Max maxim = new Max();
        int result = maxim.max(1, 2,3);
        assertThat(result, is(3));
    }

    @Test
    public void whenFirstMoreSecondMoreThird() {
        Max maxim = new Max();
        int result = maxim.max(2, 1,1);
        assertThat(result, is(2));
    }

    @Test
    public void whenFirstMoreSecondLessThird() {
        Max maxim = new Max();
        int result = maxim.max(2, 1,3);
        assertThat(result, is(3));
    }


}