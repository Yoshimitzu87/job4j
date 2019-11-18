package oop;

public class Student {
    public void music(int i) {
        System.out.println("Tra tra tra");
    }

    public  void song(int i) {
        System.out.println("I believe i can fly");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        for (int i=0; i < 3;i++){
            petya.music(i);
            petya.song(i);
        }
    }
}