package ru.job4j.tracker;


public class Attachments {
    private String name;
    private int size;

    public Attachments(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}