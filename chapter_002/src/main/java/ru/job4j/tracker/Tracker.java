package ru.job4j.tracker;


import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Tracker {


    private final List<Item> items = new ArrayList<>();




    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public List<Item> findAll() {
        return items;
    }


    public List<Item> findByName(String key) {
        List<Item> listOfNames = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().contains(key)) {
                listOfNames.add(item);
            }
        }
        return listOfNames;
    }


    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }


    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }



    public boolean deleteId(String id) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            items.remove(items.get(index));
            result = true;
        }
        return result;
    }


    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1){
            item.setId(id);
            items.set(index, item);
            result = true;
        }
        return result;
    }

}
