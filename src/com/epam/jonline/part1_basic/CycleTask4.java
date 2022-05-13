package com.epam.jonline.part1_basic;

// Составить программу нахождения произведения квадратов первых двухсот чисел

//import java.math.BigInteger;

public class CycleTask4 {
    public static void main(String[] args) {

        long res = 1;
        boolean overflow = false;

        for (int i = 1; i <= 200; i++) {

            res *= (long) Math.pow(i, 2);

            System.out.printf("%02d : res = %d\n", i, res);

            // this is alternative check for overflowing, also works
            //if ( res > res * Math.pow((i + 1), 2) ) {

            if ( res * Math.pow((i + 1), 2)  + 1  >= Long.MAX_VALUE / 2) {  // integer division is OK here
                System.out.println("Error: exceeding max value on cycle " + (i + 1) );
                System.out.println("Next value would be  = " + ( res *= i * i) );
                System.out.println("( MAX value = " + Long.MAX_VALUE + " )");

                overflow = true;

                break;
            }
        }

        if (!overflow) {
            System.out.println("Произведение квадратов первых двухсот чисел = " + res);
        }
        else {
            System.out.println("\nПереполнение пременной!\nНевозможно посчитать значение используюя примитивные типы.");
        }

       /*
       BigInteger res = BigInteger.valueOf(1);
        res = res.multiply(BigInteger.valueOf( (long) i * i) );
        System.out.println("Произведение квадратов первых двухсот чисел = " + res);
        System.out.println("Знаков в числе: " + res.toString().length());
        */
    }
}