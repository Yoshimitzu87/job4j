package oop;

public class TextReport {

    @Override
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}