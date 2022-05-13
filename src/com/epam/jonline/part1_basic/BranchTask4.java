//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.

package com.epam.jonline.part1_basic;

import java.util.Scanner;

public class BranchTask4 {
    public static void main(String[] args) {
        int a;
        int b;
        int x;
        int y;
        int z;

        a = inputIntFromConsole("a");
        a = checkValue(a, "a");

        b = inputIntFromConsole("b");
        b = checkValue(b, "b");

        x = inputIntFromConsole("x");
        x = checkValue(x, "x");

        y = inputIntFromConsole("y");
        y = checkValue(y, "y");

        z = inputIntFromConsole("z");
        z = checkValue(z, "z");

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        boolean passed = false;
        if ((x < a || x < b)
                && (y < a || y < b)) {
            System.out.println("Пройдет.");
            passed = true;
        }

        if (!passed
                && (x < a || x < b)
                && (z < a || z < b)) {
            System.out.println("Пройдет.");
            passed = true;
        }

        if (!passed
                && (z < a || z < b)
                && (y < a || y < b)) {

            System.out.println("Пройдет.");
            passed = true;
        }
        if (!passed) {
            System.out.println("Не пройдет.");
        }
    }

    private static int inputIntFromConsole(String numID) {
        @SuppressWarnings("Resource")
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\r");
        sc.useDelimiter("\n");

        System.out.print("Enter " + numID + " : ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Incorrect input. PLease enter integer number " + numID + " : ");
        }

        int result = sc.nextInt();
        sc.nextLine();
        return result;
    }

    private static int checkValue(int value, String numID) {
        while (value < 1) {
            System.out.println("Размер должен быть больше нуля! Введите новое значение.");
            value = inputIntFromConsole(numID);
        }
        return value;
    }
}
