package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find By ID ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id: ");
        Item foundedItem = tracker.findById(id);
        if (foundedItem != null) {
            System.out.println(foundedItem.getId() + " " + foundedItem.getName());
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}
