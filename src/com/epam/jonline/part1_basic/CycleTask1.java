package com.epam.jonline.part1_basic;

//Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class CycleTask1 {

    public static void main(String[] args) {

        int number;

        number = inputNumFromConsole("Please enter positive integer number: ");
        number = validateValue(number, "Please enter positive integer number: ");

        System.out.println("Sum from 1 to " + number + " = " + sum(number));
    }


    /**
     * Reads int from console. Designed to read one and only one number at a time.
     * Thus space treated as a typo because i. e. number 1[space]2 doesn't exists.
     *
     * @param message Message to the user.
     * @return Int read from the console.
     */
    private static int inputNumFromConsole(String message) {
        @SuppressWarnings("Resource")
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\r");
        sc.useDelimiter("\n");

        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Incorrect input. " + message);
        }

        int result = sc.nextInt();
        sc.nextLine();
        return result;
    }


    //Cant have zero as positive number due to conditions of the task
    //since we are calculating sum from 1 to number
    private static int validateValue(int value, String message) {
        while (value < 1) {
            System.out.print("Incorrect input. ");
            value = inputNumFromConsole(message);
        }

        return value;
    }


    /**
     * Sums integers from 1 to number (included)
     *
     * @param number Top border
     * @return Sum from 1 to number (included)
     */
    private static int sum(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        return sum;
    }
}
