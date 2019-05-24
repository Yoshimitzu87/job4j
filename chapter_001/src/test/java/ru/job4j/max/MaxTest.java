package ru.job4j.max;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenFirstLessSecondLessThirdLessFourth() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 3,4);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMoreSecondMoreThirdMoreFourth() {
        Max maxim = new Max();
        int result = maxim.max(4, 1,2,3);
        assertThat(result, is(4));
    }

    @Test
    public void whenSecondMoreFirstMoreThirdMoreFourth() {
        Max maxim = new Max();
        int result = maxim.max(2, 4,1,3);
        assertThat(result, is(4));
    }

    @Test
    public void whenFourthMoreFirstMoreThirdMoreSecond() {
        Max maxim = new Max();
        int result = maxim.max(2, 3,1,4);
        assertThat(result, is(4));
    }


}