/**package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.collecion.PhoneDictionary;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new PhoneDictionary.Task("low", 5));
        queue.put(new PhoneDictionary.Task("urgent", 1));
        queue.put(new PhoneDictionary.Task("middle", 3));
        PhoneDictionary.Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }
}*/