package ru.geekbrains.lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Project java_core_1_0321
 *
 * @Author Alexander Grigorev
 * Created 17.03.2021
 * v1.0
 */
public class ClassWork {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = "Hello";
        System.out.println(s.charAt(2));
    }

    private static void randomScanner() throws IOException {
        Random random = new Random();
        System.out.println(random.nextInt(30));

        System.out.print("Please enter the name too greet >>>>> ");
        String name = scanner.next();
        System.out.println("Hello " + name + "!");
        int number = scanner.nextInt();
        System.out.println(number);
        int x = getNumber();
        System.out.println(x);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter the name too greet >>>>> ");
        String name1 = reader.readLine();
        System.out.println("You entered " + name1);
    }

    private static int getNumber() {
        int x;
        do {
            System.out.print("Please enter a number between 0 and 30 inclusive >>>>> ");
            x = scanner.nextInt();
        } while (x < 0 || x > 30);
        return x;
    }

    private static void arraysExample() {
        //        int[] arr = {1,2,3,4,5};
//        printArr(arr);
//        float[] fArr = new float[15];
//        Arrays.fill(fArr, 100);
        int[][] int2dArr = new int[10][10];
        for (int i = 0; i < int2dArr.length; i++) {
            Arrays.fill(int2dArr[i], i * 10 + 2);
        }

        int[][][] int3d = new int[5][5][5];
//        System.out.println(Arrays.toString(int2dArr));
//        System.out.println(Arrays.deepToString(int3d));
        int[] arrForFill = new int[10];
        Arrays.fill(arrForFill, 3, 7, 99);
//        System.out.println(Arrays.toString(arrForFill));
//        Arrays.binarySearch()

        int[] arrSearch = {22, 14, 48, 56, 512, 114, 1204, -25, 148};

        int[] newArr = Arrays.copyOf(arrSearch, 20);

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1;
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(arr1 == arr2);
        System.out.println(arr1 == arr3);
        System.out.println(Arrays.equals(arr1, arr3));

        System.out.println(Arrays.toString(arr1).equals(Arrays.toString(arr3)));

//        System.out.println(Arrays.toString(newArr));
//        Arrays.sort(arrSearch);
//        System.out.println(Arrays.toString(arrSearch));
//        System.out.println(Arrays.binarySearch(arrSearch, -25));
    }

    static void printArr(int[] arr) {
        System.out.print("{ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(" }");
    }

    static int searchInArray(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }
}
