package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {

    }

    public static int calc(int n) {
        if (n < 0){
            throw new IllegalArgumentException("Cant count with negative number");}
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}

