/**
 * package ru.job4j.loop;
 * <p>
 * import ru.job4j.collecion.PhoneDictionary;
 * <p>
 * import java.util.LinkedList;
 * <p>
 * public class PriorityQueue {
 * private LinkedList<PhoneDictionary.Task> tasks = new LinkedList<>();
 * <p>
 * <p>
 * Метод должен вставлять в нужную позицию элемент.
 * Позиция определять по полю приоритет.
 * Для вставки использовать add(int index, E value)
 *
 * @param task задача
 * <p>
 * public void put(PhoneDictionary.Task task) {
 * int index = 0;
 * for (PhoneDictionary.Task element : tasks) {
 * if (element.getPriority() < task.getPriority()) {
 * index++;
 * }
 * break;
 * <p>
 * }
 * this.tasks.add(index, task);
 * }
 * <p>
 * public PhoneDictionary.Task take() {
 * return tasks.poll();
 * }
 * }
 */