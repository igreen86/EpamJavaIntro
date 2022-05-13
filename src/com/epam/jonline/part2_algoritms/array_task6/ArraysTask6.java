/* 6.  Задана  последовательность  N  натуральных  чисел.  Вычислить  сумму  чисел,  порядковые  номера  которых
 *        являются простыми числами.
 *
 * 2021-08-13
 *
 * Zelenov Ivan
 */

package com.epam.jonline.part2_algoritms.array_task6;

import com.epam.jonline.part2_algoritms.Author;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

@Author(author = "Zelenov Ivan",
        date = "2021-08-13")


public class ArraysTask6 {

    private static final Random rand = new Random();

    public static void main(String[] args) {

        int[] arr;  // последовательность  N  вещественных  чисел
        int n;                        // длинна последовательности

        n = rand.nextInt(110) + 15;
        arr = new int[n];
        initArray(arr);

        printArray(arr);
        System.out.println("Sum of elements which indexes are prime numbers = " + calculateSum(arr));
    }


    /** This fills array with random integers in range 1 - 10
     *
     * @param array not-null array of int
     */
    private static void initArray(@NotNull int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(9) + 1;
        }
    }


    /** This calculates sum of values of those elements of array
     *  which indexes are prime numbers
     *
     * @param array not-null array of int
     * @return sum of values elements of array which indexes are prime numbers
     */
    private static int calculateSum(@NotNull int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            // в массиве нумерация начинается с 0, но в последовательности натуральных чисел
            // с 1, поэтому i + 1
            if (isPrimeNumber(i + 1)) {
                sum += array[i];
                System.out.printf("added array[%d] %d", i + 1, array[i]);
                System.out.println();
            }
        }

        return sum;
    }


    /** This checks if given int number is prime number or not
     *
     * @param number int
     * @return true if number is a prime number and false otherwise
     */
    private static boolean isPrimeNumber(int number) {
        if (number  <= 1) {  // negative numbers, zero and one are NOT prime numbers
            return false;
        }

        if (number == 2 || number == 3) {
            return true;
        }

        boolean isPrime = true;

        for (int i = number - 1; i >= 2; i--) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    /** This prints array onto console in format ( [Index_1] Value_0, [Index_2] Value_1,... [Index_n + 1] Value_n )
     *
     * @param array not-null array of int
     */
    private static void printArray(@NotNull int[] array) { // not-null not-empty array provided by calling module
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d] %d ", i + 1, array[i]);
            System.out.println();
        }
        System.out.println();
    }
}
