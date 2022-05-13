package com.epam.jonline.part1_basic;


//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

import java.util.Scanner;

public class LinearTask5 {
    public static void main(String[] args) {
        int t;
        t = inputNum('T');

        while (t < 0) {
            System.out.println("Время не может быть отрицательным числом.");
            t = inputNum('T');
        }

        if (t == 0) {
            System.out.println("00ч 00мин 00с.");
            return;
        }

        int hour = t / 3600;
        int min = (t - hour * 3600) / 60;
        int sec = t - hour * 3600 - min * 60;

        String res = String.format("%02dч %02dмин %02dс. ", hour, min, sec);
        System.out.println(res);


    }

    private static int inputNum(char numName) {
        @SuppressWarnings("Resource")
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\r");
        sc.useDelimiter("\n");

        System.out.print("Enter " + numName + " : ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Incorrect input. PLease enter integer number " + numName + " : ");
        }

        int result = sc.nextInt();
        sc.nextLine();
        return result;
    }
}
