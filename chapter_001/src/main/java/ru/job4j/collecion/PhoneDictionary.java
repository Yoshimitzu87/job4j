package ru.job4j.collecion;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person a : persons) {
            if (a.getName().contains(key) || a.getSurname().contains(key)
                    || a.getPhone().contains(key) || a.getAddress().contains(key)) {
                result.add(a);
            }
        }
        return result;
    }
}