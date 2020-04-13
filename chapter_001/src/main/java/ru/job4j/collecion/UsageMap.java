package ru.job4j.collecion;


import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.put("vasya@yandex.ru","Vasiliy Vasilyev");
        map.put("ivan@yandex.ru","Ivan Ivanov");

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}