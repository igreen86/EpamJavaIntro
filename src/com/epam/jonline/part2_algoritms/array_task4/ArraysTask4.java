/* 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
 *
 * 2021-08-05
 *
 * Zelenov Ivan
 */

package com.epam.jonline.part2_algoritms.array_task4;

import java.util.Random;

public class ArraysTask4 {

    private static final Random rand = new Random();

    public static void main(String[] args) {
        int n;  // длинна массива
        n = rand.nextInt(15) + 5;

        double[] arr;
        arr = initArray(n);

        printArray(arr);
        switchMinMaxElems(arr);
        System.out.println();
        printArray(arr);
    }


    /**
     * Fills given array of doubles with random doubles in range from -100.0 to 100.0
     * @param length is the size of array
     * @return array of doubles filled with random values from -100.0 to 100.0
     */
    private static double[] initArray(int length) {  // принимает n всегда > 0 от вызывающего абонента
        double[] arr = new double[length];

        for (int i = 0; i < arr.length; i++) {

            if (rand.nextBoolean()) {  // бросаем монетку
                arr[i] = rand.nextDouble() * 100;
            } else {
                arr[i] = rand.nextDouble() * -100;
            }
        }

        return arr;
    }


    // принимает не null, не пустой массив от вызывающего абонента
    /**
     * Prints given array of doubles onto console in format (Index) Value (NextIndex) NextValue...
     *
     * @param arr is not-null not-empty array of doubles
     */
    private static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("(%d) %.3f ", i, arr[i]);
        }

        System.out.println();
    }


    // принимает не null, не пустой массив от вызывающего абонента
    /**
     * Switches min and max values in given array
     *
     * @param arr is not-null not-empty array of doubles
     */
    private static void switchMinMaxElems(double[] arr) {
        double min, max;         // min value and max value
        int minIndex, maxIndex;  // indexes of those values
        double temp;

        min = arr[0];
        max = arr[0];

        minIndex = 0;
        maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            } else if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }

        temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;

        //for testing purposes only
        //System.out.print("min = " + min);
        //System.out.println(", minIndex = " + minIndex);
        //System.out.print("max = " + max);
        //System.out.println(", maxIndex = " + maxIndex);
    }
}
