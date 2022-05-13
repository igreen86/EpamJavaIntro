/*5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
*
* 2021-08-05
*
*  Zelenov Ivan
*/

package com.epam.jonline.part2_algoritms.array_task5;

import java.util.Random;

public class ArraysTask5 {

    private static final Random rand = new Random();

    public static void main(String[] args) {
        int[] arr;
        int n;      // length of the array arr

        n = rand.nextInt(20) + 5;
        arr = new int[n];
        initArray(arr);

        printfArray(arr);
        showSpecifiedValues(arr);
    }


    /**
     * Fills array with random values in range from -10 to 20
     *
     * @param arr not-null not-empty array of int
     */
    private static void initArray(int[] arr) {  // not-null not-empty array provided by calling module
        for (int i = 0; i < arr.length; i++) {
            if (rand.nextBoolean()) { // flip a coin
                arr[i] = rand.nextInt(21);
            } else {
                arr[i] = rand.nextInt(11) * -1;
            }
        }
    }


    /**
     *  This shows values of array arr which are greater than its own index
     *
     * @param arr not-null not-empty array of int
     */
    //values are specified in the task, see line 1
    private static void showSpecifiedValues(int[] arr) {  // not-null not-empty array provided by calling module
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                System.out.printf("[%d] %d ", i, arr[i]);
            }
        }
    }


    /**
     * Prints array onto console in format ( [Index_0] Value_0, [Index_1] Value_1,... [Index_n] Value_n )
     *
     * @param arr not-null not-empty array of int
     */
    private static void printfArray(int[] arr) {  // not-null not-empty array provided by calling module
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] %d ", i, arr[i]);
        }
        System.out.println();
    }
}
