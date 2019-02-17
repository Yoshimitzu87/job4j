package ru.job4j.max;


public class Max {

    public boolean max(int first, int second, int third) {
        return first > second || first > third || second > third || third > first;
    }

}

