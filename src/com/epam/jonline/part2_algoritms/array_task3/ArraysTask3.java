/* 3. Дан массив натуральных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
* положительных и нулевых элементов.
*
* 2021-08-04
*
* Zelenov Ivan
*/

package com.epam.jonline.part2_algoritms.array_task3;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask3 {

    private static final Random rand = new Random();

    public static void main(String[] args) {
        int n;  // длина массива
        n = rand.nextInt(50) + 5;  // массив не должен быть пустым или слишком коротким

        int[] arr;
        arr = initArray(n);

        Elements elements;
        elements = calculate(arr);

        showInfo(elements, arr);
    }


    private static int[] initArray(int length) {  // принимает n всегда > 0 от вызывающего абонента
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            if (rand.nextBoolean()) {  // бросаем монетку
                arr[i] = rand.nextInt(10);
            } else {
                arr[i] = -rand.nextInt(10);
            }
        }

        return arr;
    }


    private static Elements calculate(@NotNull int[] arr) {
        Elements elements = new Elements();

        for (int i : arr) {
            if (i > 0) {
                elements.incrementPositiveElems();
            } else if (i < 0) {
                elements.incrementNegativeElems();
            } else {
                elements.incrementZeroElems();
            }
        }

        return elements;
    }


    private static void showInfo(Elements elements, @NotNull int[] arr) {
        System.out.println(Arrays.toString(arr));
        System.out.println("Положительных элементов : " + elements.getPositiveElems());
        System.out.println("Отрицательных элементов : " + elements.getNegativeElems());
        System.out.println("Нулевых элементов : " + elements.getZeroElems());
        System.out.println("\nВсего элементов : " + arr.length);
    }
}


class Elements {
    private int negativeElements; // счетчик отрицательных элементов
    private int positiveElements; // счетчик положительных элементов
    private int zeroElements;     // счетчик нулевых элементов

    Elements() {
        zeroElements = 0;
        positiveElements = 0;
        negativeElements = 0;
    }

    public int getNegativeElems() {
        return negativeElements;
    }

    public void incrementNegativeElems() {
        negativeElements++;
    }

    public int getPositiveElems() {
        return positiveElements;
    }

    public void incrementPositiveElems() {
        positiveElements++;
    }

    public int getZeroElems() {
        return zeroElements;
    }

    public void incrementZeroElems() {
        zeroElements++;
    }
}