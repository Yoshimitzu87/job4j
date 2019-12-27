package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {

    /**
     * Массив для хранения заявок.
     */
    private Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    private static final Random RN = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод находит все не пустые заявки.
     *
     * @return массив заявок.
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    /**
     * Метод ищет завяки по ключу.
     * @param key - ключ.
     * @return массив найденых заявок.
     */
    public Item[] findByName(String key) {
        Item[] findByNameItems = new Item[position];
        int j = 0;
        for (int i = 0; i < position; i++) {
            if (this.items[i] != null && this.items[i].getName().equals(key)) {
                findByNameItems[j] = this.items[i];
                j++;
            }
        }
        return Arrays.copyOf(findByNameItems, j);
    }
    /**
     * Метод реализаущий поиск заявки по id.
     * @param id индекс для поиска.
     * @return заявка с таким id.
     */
    public Item findById(String id) {
        Item result = null;
        for (int i = 0; i < position; i++) {
            Item item = items[i];
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
    }
}