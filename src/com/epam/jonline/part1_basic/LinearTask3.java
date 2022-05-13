package com.epam.jonline.part1_basic;

import java.util.Scanner;

import static java.lang.Math.*;

 /*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
*       ( sin(x) + cos(y) ) / ( cos(x) - sin(y) ) * tg(x * y)
*/
public class LinearTask3 {
    public static void main(String[] args) {
        double x = inputNum('x');
        double y = inputNum('y');
        double denominator;

        denominator = (cos(x) - sin(y)) * tan(x * y);
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator can't be zero!");
        }
        double res = ( sin(x) + cos(y) ) / denominator;
        System.out.println(res);

    }

    public static double inputNum(char numName) {
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
}
