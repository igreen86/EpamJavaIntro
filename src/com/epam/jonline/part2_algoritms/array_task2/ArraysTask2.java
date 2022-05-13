/* 2. Дана последовательность натуральных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим
 * числом. Подсчитать количество замен.
 *
 * 2021-08-04
 *
 * Zelenov Ivan
 */

package com.epam.jonline.part2_algoritms.array_task2;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask2 {

    private static final Random rand = new Random();

    public static void main(String[] args) {

        int n;          // данная длина массива
        int z;          // данное z
        int count = 0;  // счетчик кол-ва замен

        // массив не должен быть пустым, так же нежелательно чтобы он был слишком коротким
        n = rand.nextInt(20) + 5;
        z = rand.nextInt(75) + 1;  // z > 0 по смыслу условия
        int[] arr = new int[n];
        initArray(arr);

        System.out.println("Исходный массив\n" + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                count++;
            }
        }

        System.out.println("Z = " + z);
        System.out.println();
        System.out.println("Замененный массив\n" + Arrays.toString(arr));
        System.out.println("Число замен = " + count);
    }


    private static void initArray(int[] array) {  //никогда не должен принять null
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
    }
}
