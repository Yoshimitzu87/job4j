package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete Item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id");
        if (tracker.deleteId(id)) {
            System.out.println("Deleted");
        } else {
            System.out.println("Item don't exist");
        }
        return true;
    }
}
