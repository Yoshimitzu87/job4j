/**package ru.job4j.loop;

import ru.job4j.collecion.PhoneDictionary;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<PhoneDictionary.Task> tasks = new LinkedList<>();


     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     *
    public void put(PhoneDictionary.Task task) {
        int index = 0;
        for (PhoneDictionary.Task element : tasks) {
            if (element.getPriority() < task.getPriority()) {
                index++;
            }
            break;

        }
        this.tasks.add(index, task);
    }

    public PhoneDictionary.Task take() {
        return tasks.poll();
    }
}
*/