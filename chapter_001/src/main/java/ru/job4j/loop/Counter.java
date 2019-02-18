package ru.job4j.loop;

/**
 *
 */
public class Counter {
    public int add(int start, int finish) {
        int i = 0;
        for (int index = start; index <= finish; index++) {
            if (index % 2 == 0) {
                i += index;
            }
        }
        return i;
    }
}

