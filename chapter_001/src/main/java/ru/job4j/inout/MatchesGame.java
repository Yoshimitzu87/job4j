package ru.job4j.inout;

import java.util.Scanner;

public class MatchesGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pool = 11;
        System.out.println("Всего есть 11 спичек");
        System.out.println("вы берёте от 1-й до 3-х спичек по очереди");
        System.out.println("игра заканчивается когда игрок забрал последние спички");
        System.out.println("Вводите количество спичек которые вы хотите взять, по очереди");
        System.out.print(  "игрок берет спичек: ");
        while (pool > 0) {
            int select = input.nextInt();
            input.nextLine(); // дочитываем строку до конца.
                if (select == 1) {
                    pool = pool - select;
                    System.out.println("осталось спичек: " + pool);
                } else if (select == 2) {
                    pool = pool - select;
                    System.out.println("осталось спичек: " + pool);
                } else if (select == 3) {
                    pool = pool - select;
                    System.out.println("осталось спичек: " + pool);
                } if (pool == 0) {
                    System.out.println("Победил последний игрок!!!");
                }

            }
        }
    }
