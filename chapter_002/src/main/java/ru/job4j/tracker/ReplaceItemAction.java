package ru.job4j.tracker;

public class ReplaceItemAction implements UserAction {
    @Override
    public String name() {
        return "=== Replace Item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter a new name: ");
        Item item = new Item(name, id);
        if (tracker.replace(id, item)) {
            System.out.println("ID " + id + " renamed: " + name);
        } else {
            System.out.println("Item don't exist!");
        }
        return true;
    }
}
