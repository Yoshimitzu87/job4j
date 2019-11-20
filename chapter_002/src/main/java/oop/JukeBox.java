package oop;

public class JukeBox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        for (int position = 0; position < 3; position++) {
            JukeBox tOne = new JukeBox();
            System.out.println("Track Playing:");

            tOne.music(position);

        }
    }
}