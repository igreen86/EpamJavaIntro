package com.epam.jonline.part1_basic;

//Найти max{min(a, b), min(c, d)}.

import java.util.Scanner;

public class BranchTask2 {
    public static void main(String[] args) {
        int a = inputNum('a');
        int b = inputNum('b');
        int c = inputNum('c');
        int d = inputNum('d');

        System.out.println( max( min(a, b), min(c, d) ) );
    }

    private static int max(int a, int b) {
        return a >= b ? a : b;
    }

    private static int min(int a, int b) {
        return a <= b ? a : b;
    }

    public static int inputNum(char numName) {
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