package ru.job4j.collecion;

import java.util.ArrayList;


public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");
        for (Object list : names) {
            System.out.println(list);
        }
    }
}
