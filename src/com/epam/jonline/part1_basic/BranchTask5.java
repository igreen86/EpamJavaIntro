package com.epam.jonline.part1_basic;

// Вычислить значение функции
// если x <= 3 то x*x - 3x + 9
// если x > 3 то 1 / (pow(x, 3) + 6)

import java.util.Scanner;

public class BranchTask5 {
    public static void main(String[] args) {
        int x;
        x = inputNum("x");

        if (x <= 3) {
            System.out.println(x * x - 3 * x + 9);
        } else {
            if (Math.pow(x, 3) + 6 != 0) {
                System.out.println( 1 / (Math.pow(x, 3) + 6) );
            } else {
                System.out.println("Cant divide by zero!");
            }
        }
    }

    private static int inputNum(String numName) {
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
