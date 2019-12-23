package oop.pojo;

public class Library {
    public static void main(String[] args) {
        Book firstbook = new Book("Firstbook", 150);
        Book cleancode = new Book("Cleancode", 120);
        Book third = new Book("Thirdbook", 160);
        Book fourth = new Book("Fourthbook", 200);


        Book[] bookz = new Book[4];
        bookz[0] = firstbook;
        bookz[1] = cleancode;
        bookz[2] = third;
        bookz[3] = fourth;


        for (int index = 0; index < bookz.length; index++) {
            Book bk = bookz[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }

        System.out.println("Replace third to first");

        for (int index = 0; index < bookz.length; index++) {
            Book temp = bookz[0];
            bookz[0] = bookz[2];
            bookz[2] = temp;
            Book bk = bookz[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }

        System.out.println("Show book named cleancode");

        for (int index = 0; index < bookz.length; index++) {
            Book bk = bookz[index];
            if (bk.getName().equals(("Cleancode"))); {
                System.out.println(bk.getName() + " - " + bk.getPages());
            }
        }
    }
}