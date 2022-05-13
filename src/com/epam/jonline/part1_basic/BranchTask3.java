package com.epam.jonline.part1_basic;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой

import java.util.Scanner;

public class BranchTask3 {
    public static void main(String[] args) {
        int x1 = inputNum("x1");
        int y1 = inputNum("y1");
        int x2 = inputNum("x2");
        int y2 = inputNum("y2");
        int x3 = inputNum("x3");
        int y3 = inputNum("y3");

        // Посчитаем площадь треугольника, образованного данными тремя токами
        // Если она = 0, значит точки на одной прямой
        // Иначе - не на одной прямой
        double s = ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) / 2;
        if (s == 0) {
            System.out.println("Точки находятся на одной прямой");
        } else System.out.println("Точки  НЕ находятся на одной прямой");
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
