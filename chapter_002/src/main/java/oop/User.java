package oop;

public class User {
    private String name;  //поле обьекта
    private int age;      //поле обьекта

    public boolean canDrive() {
        boolean can = false;  // локальная переменная
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}