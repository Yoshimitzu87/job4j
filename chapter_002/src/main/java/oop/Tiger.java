package oop;

public class Tiger extends Predator {


    public Tiger(){
        super();
    }

    public Tiger(String name) {
        super(name);
        System.out.println("TIGER CLASS");

    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();

    }
}
