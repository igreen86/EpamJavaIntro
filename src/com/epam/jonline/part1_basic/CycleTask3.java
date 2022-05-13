package com.epam.jonline.part1_basic;

//Найти сумму квадратов первых ста чисел

public class CycleTask3 {
    public static void main(String[] args) {

        long sum = 0;
        boolean overflow = false;

        for (int i = 1; i <= 100; i++) {

            sum += Math.pow(i, 2);

            if (sum + 1 >= Long.MAX_VALUE / 2 && i < 100) {

                System.out.println("Error: exceeding max value on cycle " + i);
                overflow = true;
                break;
            }
        }

        if (overflow) {
            System.out.println("\nПереполнение пременной!\nНевозможно посчитать значение используюя примитивные типы.");
        } else {
            System.out.println("Сумма квадратов первых ста чисел = " + sum);
        }

    }
}
