package com.epam.jonline.part1_basic;

// Найдите значение функции: z = ( (a – 3 ) * b / 2) + c

import java.util.Scanner;

public class LinearTask1 {
    public static void main(String[] args) {

        double a;
        double b;
        double c;

        a = inputDoubleFromConsole("a");
        b = inputDoubleFromConsole("b");
        c = inputDoubleFromConsole("c");

        System.out.println();
        System.out.printf("a = %.3f, b = %.3f, c = %.3f\n\n", a, b, c);
        System.out.println("z = " + (((a - 3) * b / 2) + c));
    }

    private static double inputDoubleFromConsole(String numID) {
        @SuppressWarnings("Resource")
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\r");
        sc.useDelimiter("\n");

        System.out.print("Enter " + numID + " : ");


        while (!sc.hasNextDouble()) {   // Как сделать проверку на то что вводимый токен не больше Double.MAX_VALUE и не меньше Double.MIN_VALUE ???
            sc.nextLine();
            System.out.print("Incorrect input. PLease enter real number " + numID + " : ");
        }

        double result = sc.nextDouble();
        sc.nextLine();
        return result;
    }
}
