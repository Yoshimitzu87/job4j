package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


public class CrItTest {

    @Test
    public void whenCreateItem() {
        String[] answers = {"New Item", "New desc", "11"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[1];
        Item expected = new Item("New Item", "New desc", 11);
        assertThat(created.getName(), is(expected.getName()));
    }
}

