package ru.job4j.inout;

import java.util.Scanner;
import java.util.Random;

public class MagickBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? Задай вопрос на который можно ответить либо да, либо нет. ");
        String a = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Да");
        } else if (answer == 1) {
            System.out.println("Нет");
        } else if (answer == 2) {
            System.out.println("Возможно");
        }
    }
}