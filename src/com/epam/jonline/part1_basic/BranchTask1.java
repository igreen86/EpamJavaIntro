/*Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
* то будет ли он прямоугольным.
*
*2021-08-04
*
* Zelenov Ivan
 */
package com.epam.jonline.part1_basic;

import java.util.Scanner;

public class BranchTask1 {
    public static void main(String[] args) {
        double angle1;
        double angle2;

        angle1 = inputNum("angle 1");
        angle2 = inputNum("angle 2");

        checkTriangle(angle1, angle2);
    }

    private static double inputNum(String numName) {
        @SuppressWarnings("Resource")
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\r");
        sc.useDelimiter("\n");

        System.out.print("Enter " + numName + " : ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Incorrect input. PLease enter real number " + numName + " : ");
        }

        double result = sc.nextDouble();
        sc.nextLine();
        return result;
    }

    private static void checkTriangle(double angle1, double angle2) {

        if (angle1 + angle2 >= 180 || angle1 <= 0 || angle2 <= 0) {
            System.out.println("Такого треугольника не существует.");
            System.exit(0);
        }

        if (angle1 == 90 || angle2 == 90 || angle2 + angle1 == 90) {
            System.out.println("Такой треугольник существует и является прямоугольным.");
        } else System.out.println("Такой треугольник существует и НЕ является прямоугольным.");
    }
}
