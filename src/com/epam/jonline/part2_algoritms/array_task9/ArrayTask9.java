/*
*  9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
*        чисел несколько, то определить наименьшее из них.
*
* 2021-10-08
*
* Zelenov Ivan
*/

package com.epam.jonline.part2_algoritms.array_task9;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Text;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ArrayTask9 {

    private static final Random rand = new Random();

    public static void main(String[] args) {
        int[] arr;
        int n;

        n = rand.nextInt(15) + 10;
        arr = new int[n];
        initArray(arr);

        int[] quantity = new int[arr.length];
        countFreq(arr,quantity);



        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(quantity));
    }

    private static void initArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(15);
        }
    }

    private static void countFreq(int[] arr, int[] quantity) {
        for (int i = 0; i < arr.length; i++) {
            for (int k : arr) {
                if (arr[i] == k) {
                    quantity[i]++;
                }
            }
        }
    }


}
