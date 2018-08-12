package ru.job4j.maxTest;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Anton Frolov (mailto:spitfires111@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenFirstMoreSecond() {
        Max maxim = new Max();
        int result = maxim.max(2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenFirstMoreThird() {
        Max maxim = new Max();
        int result = maxim.max(1, 15);
        assertThat(result, is(2));
    }
    @Test
    public void whenSecondLessThird() {
        Max maxim = new Max();
        int result = maxim.max(2, 15);
        assertThat(result, is(2));
    }
}