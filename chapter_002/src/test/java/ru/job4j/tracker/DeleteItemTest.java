package ru.job4j.tracker;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;



public class DeleteItemTest {
    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                item.getId(),
        };
        StartUI.deleteItem(new StubInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        assertThat(deleted, is("null"));
    }
}
