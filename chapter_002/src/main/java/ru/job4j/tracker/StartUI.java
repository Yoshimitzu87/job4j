package ru.job4j.tracker;

public class StartUI {

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(input.askStr("Enter menu item: "));
            Item item = null;
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name =  input.askStr("Enter name:");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== All items ====");
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    System.out.println(item.getId() + " " + item.getName());
                }
            } else if (select == 2) {
                System.out.println("=== Replaced item ====");
                System.out.print("Enter id: ");
                String id =  input.askStr("Enter id: ");
                String name =  input.askStr("Enter a new name: ");
                Item item = new Item(name, id);
                if (tracker.replace(id,item)) {
                    System.out.println("ID " + id + " renamed: " + name);
                } else {
                    System.out.println("Item don't exist!");
                }

            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                String id =  input.askStr("Enter id");
                if (tracker.deleteId(id)) {
                    System.out.println("Deleted");
                } else {
                    System.out.println("Item don't exist");
                }

            } else if (select == 4) {
                System.out.println("=== Find by Id ====");
                String id =  input.askStr("Enter id: ");
                item = tracker.findById(id);
                if (item == null) {
                    System.out.println("Item with id:" + id + "dont exist!");
                } else {
                    System.out.println(item.getName());
                }


            } else if (select == 5) {
                System.out.println("=== Find by name ====");
                String name =  input.askStr("Enter name: ");
                Item[] items = tracker.findByName(name);
                for (Item item : items) {
                    System.out.println(item.getId() + " " + item.getName());
                }
                System.out.println();
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }
}