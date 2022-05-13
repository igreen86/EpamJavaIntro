/*
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 *
 * 2021-08-04
 *
 * Zelenov Ivan
 */

package com.epam.jonline.part2_algoritms.array_task1;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask1 {
    public static void main(String[] args) {
        Random rand = new Random();

        int n; // данная длина массива
        int k; // данное кратное
        int sum = 0;

        // массив не должен быть пустым, так же нежелательно чтобы он был слишком коротким
        n = rand.nextInt(20) + 5;
        int[] arr = new int[n];
        k = rand.nextInt(10) + 1;  //кратное не должно быть равно 0

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100 + 1);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Кратное = " + k);

        for (int i : arr) {
            if (i % k == 0) {
                System.out.println(i + " % " + k + " == 0");
                sum += i;
            }
        }

        System.out.println();
        System.out.println("Сумма элементов, которые кратны данному К = " + sum);
    }
}
