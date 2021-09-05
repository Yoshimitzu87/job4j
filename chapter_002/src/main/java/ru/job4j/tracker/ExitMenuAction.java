package ru.job4j.tracker;

public class ExitMenuAction implements UserAction {
    @Override
    public String name() {
        return "=== Exit Menu ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
