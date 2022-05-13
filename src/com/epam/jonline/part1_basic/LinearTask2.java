package com.epam.jonline.part1_basic;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// b + Math.sqrt( b * b + 4 * a * c ) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2)

import java.util.Scanner;

public class LinearTask2 {
    public static void main(String[] args) {

        double a = inputDoubleFromConsole("Enter a : ");
        double b = inputDoubleFromConsole("Enter b : ");
        double c = inputDoubleFromConsole("Enter c : ");

        while (a == 0) {
            System.out.println("Cant divide by zero!\nInput new non-zero value for a please.");
            a = inputDoubleFromConsole("Enter non-zero a : ");
        }

        if (b == 0) {
            System.out.println("Zero power -2 equals infinity!");
            System.out.println("Input new non-zero value for b OR zero again if you are OK with infinity result.");
            b = inputDoubleFromConsole("Enter b : ");
        }

        double result;
        result = ( b + Math.sqrt( b * b + 4 * a * c ) / 2 * a ) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println("Result = " + result);
    }


    private static double inputDoubleFromConsole(String message) {
        @SuppressWarnings("Resource")
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\r");
        sc.useDelimiter("\n");

        System.out.print(message);

        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Incorrect input. PLease enter real number : ");
        }

        double result = sc.nextInt();
        sc.nextLine();
        return result;
    }
}
