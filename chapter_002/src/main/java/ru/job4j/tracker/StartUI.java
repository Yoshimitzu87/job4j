package ru.job4j.tracker;

public class StartUI {


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input valid = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ReplaceItemAction(),
                new FindAllAction(),
                new DeleteAction(),
                new FindByNameAction(),
                new FindByIdAction(),
                new ExitMenuAction()
        };
        new StartUI().init(valid, tracker, actions);
    }


    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", 7);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }


    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }
}
