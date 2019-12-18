package oop;

public class Predator extends Animal {

    public Predator(){
        super();
    }

    public Predator (String name) {
        super(name);
        System.out.println("PREDATOR");
    }

    public static void main(String[] args) {
        Predator predator = new Predator();

    }
}