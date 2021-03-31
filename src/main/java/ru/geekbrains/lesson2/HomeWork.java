package ru.geekbrains.lesson2;

import java.util.Arrays;
import java.util.Scanner;


//      Домашка:
//  1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью
//      цикла и условия заменить 0 на 1, 1 на 0;
//  2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
//  3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
//  4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое) и с помощью цикла(-ов)
//      заполнить его диагональные элементы единицами;
//  5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
//  6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
//      если в массиве есть место, в котором сумма левой и правой части массива равны.
//      Примеры:
//      checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
//      checkBalance([1, 1, 1, || 2, 1]) → true, граница
//      показана символами ||, эти символы в массив не входят.
//  7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
//      или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются
//      циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//      Примеры:
//      [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
//      [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
//      При каком n в какую сторону сдвиг можете выбирать сами.

public class HomeWork {

    public static void main(String[] args) {
        taskOne();

        taskTwo();

        taskThree();

        taskFour();

        taskFive();

        taskSix();

        taskSeven();
    }

    private static void taskSeven() {
        System.out.println("\n\nЗадача №7");
        int[] intList = new int[] {1, 5, 3, 2, 11};
        String intString = Arrays.toString(intList);
        System.out.println("Входной массив: "+ intString);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите кол-во смещений: ");
        int n = scanner.nextInt();

        int[] result = moveList(intList, n);
        String resultString = Arrays.toString(result);
        System.out.println("Результат смещения: "+ resultString);
        Arrays.equals(intList, result);
    }

    private static int[] moveList(int[] intList, int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int read = 0;
                int writeAfter = 0;
                for (int j = 0; j < (intList.length); j++) {
                    read = (j == 0) ? intList[(intList.length - 1)] : writeAfter;
                    writeAfter = intList[j];
                    intList[j] = read;
                }
            }
        } else {
            n = (n < 0) ? -n : n;
            for (int i = 0; i < n; i++) {
                int writeInEnd = 0;
                for (int j = 0; j < (intList.length); j++) {
                    if (j == 0) writeInEnd = intList[j];
                    intList[j] = (j < (intList.length - 1)) ? intList[j+1] : writeInEnd;
                }
            }
        }
        return intList;
    }

    private static void taskSix() {
        System.out.println("\n\nЗадача №6");
        int[] intList = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9};
        String intString = Arrays.toString(intList);
        System.out.println("Входной массив: "+ intString);
        boolean result = checkBalance(intList);
        System.out.println("Проверка баланса вернула: "+ result);
    }

    private static boolean checkBalance(int[] intList) {
        int sum = 0;
        for (int iter: intList) {
            sum = sum + iter;
        }
        int mod = sum % 2;
        return (mod == 0 ? true : false);
    }

    private static void taskFive() {
        System.out.println("\n\nЗадача №5");
        int[] intList = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int minVal = 0;
        int maxVal = 0;
        for (int i = 0; i < intList.length; i++) {
            int iter = intList[i];
            if (i == 0) {
                minVal = iter;
                maxVal = iter;
            } else {
                if (iter > maxVal) maxVal = iter;
                else if (iter < minVal) minVal = iter;
            }
        }
        System.out.println("Минимальное значение в массиве: "+ minVal +"\n"+"Максимальное значение в массиве: "+ maxVal);
    }

    private static void taskFour() {
        System.out.println("\n\nЗадача №4");
        int string = 5;
        int column = 5;
        String[][] intList = new String[string][column];
        for (int i = 0; i < string; i++) {
            for (int j = 0; j < column; j++) {
                if((i == 0 & j == 0) ||
                        (i == 0 & j == 4) ||
                        (i == 1 & j == 1) ||
                        (i == 1 & j == 3) ||
                        (i == 2 & j == 2) ||
                        (i == 3 & j == 3) ||
                        (i == 3 & j == 1) ||
                        (i == 4 & j == 4) ||
                        (i == 4 & j == 0)) intList[i][j] = "1";
                else intList[i][j] = "0";
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + intList[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void taskThree() {
        System.out.println("\n\nЗадача №3");
        int[] intList = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        String intString = Arrays.toString(intList);
        System.out.println("Первичное состояние массива: "+ intString);
        for (int i = 0; i < intList.length; i++) {
            int iter = intList[i];
            if(iter < 6) intList[i] = iter * 2;
        }
        intString = Arrays.toString(intList);
        System.out.println("Коненое состояние массива:  "+ intString);
    }

    private static void taskTwo() {
        System.out.println("\n\nЗадача №2");
        int[] intList = new int[8];
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            if(i == 0) intList[i] = sum;
            else intList[i] = i * 3;
        }
        String intString = Arrays.toString(intList);
        System.out.println(intString);
    }

    private static void taskOne() {
        System.out.println("\n\nЗадача №1");
        int[] intList = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        String intString = Arrays.toString(intList);
        System.out.println("Первичное состояние массива: "+ intString);
        for (int i = 0; i < intList.length; i++) {
            int iter = intList[i];
            if(iter == 1) intList[i] = 0;
            else intList[i] = 1;
        }
        intString = Arrays.toString(intList);
        System.out.println("Коненое состояние массива:   "+ intString);
    }
}
