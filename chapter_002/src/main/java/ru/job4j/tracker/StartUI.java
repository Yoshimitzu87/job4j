package ru.job4j.tracker;

import java.util.Arrays;
import java.util.List;

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
        new StartUI().init(valid, tracker, Arrays.asList(actions));
    }


    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }


    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            System.out.println(index + ". " + actions.get(index).name());
        }
    }
}
