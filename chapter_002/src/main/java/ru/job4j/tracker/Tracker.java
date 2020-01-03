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
    public  Item findById(String id) {
        Item res = null;
         int rs = indexOf(id);
        if (rs != -1) { res = items[rs]; }
        return res;
    }


    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
    }

    /**
     * Метод удаляет заявку с идентификатором id.
     * @param id - идентификатор для удаления.
     * @return
     */
    public boolean deleteId(String id) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                System.arraycopy(this.items, i + 1, items, i, position - i - 1);
                result = true;
                position--;
                break;
            }
        }
        return result;
    }

    /**
     * Метод перезаписывает заявку с идентификатором id на заявку item.
     * @param id - идентификатор заявки.
     * @param item - заявка для замены.
     * @return результат замены.
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < position; i++) {
            if (items[i] != null && items[i].getId().equals(id)) {
                items[i] = item;
                items[i].setId(id);
                result = true;
                break;
            }
        }
        return result;
    }
    }
