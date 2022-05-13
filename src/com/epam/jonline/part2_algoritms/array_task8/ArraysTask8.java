/*  7. Дана  последовательность  целых  чисел a[1], a[2]... a[n].
* Образовать  новую  последовательность,  выбросив  из исходной те члены, которые равны
* min(a[1], a[2]... a[n]).
*
* 2021-08-13
*
*  Zelenov Ivan
*/

package com.epam.jonline.part2_algoritms.array_task8;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask8 {

    private static final Random rand = new Random();


    public static void main(String[] args) {

        int[] arr;
        int n;
        int minValue;
        int minValueCount;
        int[] minValueIndexes;

        n = rand.nextInt(50) + 20;
        arr = new int[n];
        initArray(arr);

        minValue = calcMin(arr);
        System.out.println("minValue = " + minValue);

        minValueCount = calcMinValue(arr, minValue);
        System.out.println("minValueCount = " + minValueCount);

        minValueIndexes = calcIndexesOfMinValue(arr, minValue);
        printMinIndexes(minValueIndexes);
        System.out.println();

        System.out.println("initial array " + Arrays.toString(arr));

        int[] resultArr;
        resultArr = removeElements(arr, minValueIndexes, minValueCount);
        System.out.println("RESULT array  " + Arrays.toString(resultArr));
    }


    private static void printMinIndexes(int[] minValueIndexes) {
        System.out.print("MinValueIndexes are : ");
        for (int minValueIndex : minValueIndexes) {
            if (minValueIndex != -1) {
                System.out.print(minValueIndex + ", ");
            }
        }
        System.out.println();
    }

    private static int[] removeElements(int[] arr, int[] minValueIndexes, int minValueCount) {
        int[] resultArr = new int[arr.length - minValueCount];
        int[] buffArr = new int[arr.length];
        System.arraycopy(arr, 0, buffArr, 0, arr.length);

        for (int i = 0; i < minValueCount; i++) {
            System.arraycopy(arr, (minValueIndexes[i] + 1), buffArr, (minValueIndexes[i] - i), (arr.length -1 - minValueIndexes[i]));

        }

        System.arraycopy(buffArr, 0, resultArr, 0, (arr.length - minValueCount));
        return resultArr;
    }


    /** This fills array with random ints in range -50 to 50
     *
     * @param array not-null array of ints
     */
    private static void initArray(int[] array) {  // not-null array of ints provided by calling module
        for (int i = 0; i < array.length; i++) {
            if (rand.nextBoolean()) {
                array[i] = rand.nextInt(6);
            } else {
                array[i] = -rand.nextInt(6);
            }
        }
    }


    /** This returns minValue between all elements in the array
     *
     * @param array not-null array of ints
     * @return minValue between all elements in the array
     */
    private static int calcMin(int[] array) {
        int minValue = array[0];

        for (int j : array) {
            if (minValue > j) {
                minValue = j;
            }
        }

        return minValue;
    }


    private static int calcMinValue(int[] arr, int minValue) {
        int count = 0;
        for (int i : arr) {
            if (i == minValue) {
                count++;
            }
        }

        return count;
    }


    /** This finds indexes of elements in array with minValue and returns array with those or -1 otherwise
     *
     * @param array not-null array of ints
     * @param minValue minValue
     * @return indexes of elements in array with minValue and returns array with those or -1 otherwise
     */
    private static int[] calcIndexesOfMinValue(int[] array, int minValue) {
        int[] minIndexes;
        minIndexes = new int[array.length];
        Arrays.fill(minIndexes, -1);

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] == minValue) {
                minIndexes[j] = i;
                j++;
            }
        }


        return minIndexes;
    }
}
