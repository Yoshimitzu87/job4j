package oop;

public class Predator extends Animal {

    public Predator(){}

    public Predator (String name) {
        super();
        System.out.println("PREDATOR CLASS");
    }

    public static void main(String[] args) {
        Predator predator = new Predator();

    }
}