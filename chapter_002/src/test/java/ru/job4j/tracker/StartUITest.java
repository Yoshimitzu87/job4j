package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[]{"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[]{action});
        assertThat(action.isCall(), is(true));
    }


    @Test
    public void whenCreateItem() {
        String[] answers = {"test1"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        UserAction create = new CreateAction();
        create.execute(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("test1");
        assertThat(created.getName(), is(expected.getName()));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item item = new Item("test");
        tracker.add(item);
        String[] answer = {item.getId()};
        Input input = new StubInput(answer);
        UserAction delete = new DeleteAction();
        delete.execute(input, tracker);
        String expected = null;
        assertThat(tracker.findById(item.getId()), is(expected));
    }
    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] { action });
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }

}
