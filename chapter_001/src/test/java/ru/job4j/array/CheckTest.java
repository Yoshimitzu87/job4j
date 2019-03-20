package ru.job4j.array;

/**
 * CheckTest
 *
 * @author Anton Frolov
 * @version $Id$
 * @since 0.1 (20.03.2019)
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByFalseThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[]{true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataMonoByFalseThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[]{false, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }
}