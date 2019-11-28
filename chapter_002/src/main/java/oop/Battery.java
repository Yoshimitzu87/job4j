package oop;

public class Battery {
    private int value;

    public Battery(int size) {
        this.value = size;
    }

    public void exchange(Battery another) {
        this.value = this.value + another.value;
        another.value = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(5);
        Battery second = new Battery(7);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.exchange(second);
        System.out.println("first : " + first.value + ". second : " + second.value);

    }
}