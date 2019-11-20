package ru.job4j.inout;
import java.util.Scanner;

public class MatchesGame {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
        int pool = 11;
        System.out.println("Игрок 1, введите своё имя:");
        String name1 = scan.nextLine();
        System.out.println("Игрок 2, введите своё имя:");
        String name2 = scan.nextLine();
        boolean isPlayer = false;
        System.out.println("Вводите количество спичек которые вы хотите взять, по очереди");
        while (pool > 0) {
            System.out.println((isPlayer ? name2 : name1) + ", сколько берёте спичек? ");
            int select = scan.nextInt();
            if (select <= 3) {
                    pool = pool - select;
                    System.out.println("осталось спичек: " + pool);
                    isPlayer = !isPlayer;
                } else if (select > 3) {
                    System.out.println("Одну,Две или Три спички");
                } if (pool == 0) {
                    System.out.println("Победитель " + (isPlayer ? name2 : name1) + "!");
                }

            }
        }
    }
