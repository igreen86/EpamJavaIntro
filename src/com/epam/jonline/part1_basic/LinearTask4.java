package com.epam.jonline.part1_basic;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.

public class LinearTask4 {
    public static void main(String[] args) {

        double[] num = {111.222, -333.444, 0, 777.777};

        for (int i = 0; i < num.length; i++) {
            System.out.printf("Test case %d = %.3f\n", i + 1, num[i]);
            System.out.printf("Flipped by rounding output = %3.3f", flipByRounding(num[i]));
            System.out.println();
        }

        System.out.println("\n============================================\n");

        for (int i = 0; i < num.length; i++) {
            System.out.printf("Test case %d = %.3f\n", i + 1, num[i]);
            System.out.printf("Flipped by substring output = %3.3f", flipBySubString(num[i]));
            System.out.println();
        }
    }

    private static double flipByRounding(double num) {

        if (num == 0) {
            return 0;
        }

        int integerPart;
        double fractionPart;
        double result;

        integerPart = (int) num;

        fractionPart = num - integerPart;
        fractionPart = (double) Math.round(fractionPart * 1000d) / 1000d;

        result = fractionPart * 1000 + (double) integerPart / 1000d;

        return result;
    }


    private static double flipBySubString(double num) {
        double result = 0;

        if (num == 0) {
            return 0;
        }

        if (num > 0) {
            String str = Double.toString(num);
            String left = str.substring(0, 3);
            String right = str.substring(4, 7);


            String whole = right + "." + left;
            result = Double.parseDouble(whole);
        } else if (num < 0) {
            String str = Double.toString(num);
            String left = str.substring(1, 4);
            String right = str.substring(5, 8);

            String whole = "-" + right + "." + left;
            result = Double.parseDouble(whole);
        } else {
            System.out.println("This part should not be reachable (str 70)");
        }

        return result;
    }
}
