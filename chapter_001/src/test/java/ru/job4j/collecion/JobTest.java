package ru.job4j.collecion;


import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriorityDown() {
        Comparator<Job> downCmpNamePriority = new JobDescByNameUp().thenComparing(new JobDescByPriorityUp());
        int rsl = downCmpNamePriority.compare(
                new Job("Job3", 3),
                new Job("Job4", 4)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorByNameAndPriorityUp() {
        Comparator<Job> upCmpNamePriority = new JobDescByNameDown().thenComparing(new JobDescByPriorityDown());
        int rsl = upCmpNamePriority.compare(
                new Job("Job7", 7),
                new Job("Job8", 8)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByNameDown().thenComparing(new JobDescByPriorityDown());
        int rsl = cmpNamePriority.compare(
                new Job("о1", 4),
                new Job("о2", 5)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenSameName() {
        Comparator<Job> downCmpNamePriority = new JobDescByNameUp().thenComparing(new JobDescByPriorityUp());
        int rsl = downCmpNamePriority.compare(
                new Job("Job11", 3),
                new Job("Job11", 4)
        );
        assertThat(rsl, lessThan(0));
    }
}
