package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for (int i = 0; data.length <= i; i++) {
            if (data[i - 1] = data[i])
                result = true;
        }
        return result;
    }
}
