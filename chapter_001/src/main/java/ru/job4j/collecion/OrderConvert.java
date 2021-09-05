package ru.job4j.collecion;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();

        for (Order ol : orders) {
            map.put(ol.getNumber(), ol);
        }
        return map;
    }
}