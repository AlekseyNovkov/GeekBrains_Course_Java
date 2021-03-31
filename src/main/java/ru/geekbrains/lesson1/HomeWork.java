package ru.geekbrains.lesson1;

import java.util.Scanner;

//      Домашка:
//    1. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода;
//    2. Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
//    3. Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
//    4. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
//    *. Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. Для проверки работы вывести результаты работы метода в консоль


public class HomeWork {

    public static void main(String[] args) {
        System.out.println("\n\n\nЗадача №1");
        taskFirst();


        System.out.println("\n\n\nЗадача №2");
        boolean taskTwoResult = taskSecond();
        System.out.println("Результат проверки суммы: " + taskTwoResult);


        System.out.println("\n\n\nЗадача №3");
        boolean taskThreeResult = taskThird();
        System.out.println("Результат проверки числа на положительное/отрицательное значение: "+ taskThreeResult);


        System.out.println("\n\n\nЗадача №4");
        String taskFourthResult = taskFourth();
        System.out.println(taskFourthResult);


        System.out.println("\n\n\nЗадача под звёздочкой");
        String taskFiwResult = taskUnderTheAsterisk();
        System.out.println(taskFiwResult);
    }

    private static String taskUnderTheAsterisk() {
        Scanner scanner = new Scanner(System.in);
        String result;

        System.out.println("Укажите год:");
        int year = scanner.nextInt();

        if (year %100==0 && year %400 ==0 )
            result = "Количество дней в году: 366. Год высокостный";
        else if (year % 4 == 0 && year % 100 > 0)
            result = "Количество дней в году: 366. Год высокостный";
        else if (year % 100 == 0)
            result = "Количество дней в году: 365. Год не высокостный";
        else
            result = "Количество дней в году: 365. Год не высокостный";
        return result;
    }

    private static String taskFourth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите ваше имя:");
        String name = scanner.nextLine();
        return "Привет " + name + "!";
    }

    private static boolean taskThird() {
        Scanner scanner = new Scanner(System.in);
        boolean result;
        System.out.println("Укажите целое положительное/отрицательное число для переменной:");
        int a = scanner.nextInt();

        if(a > 0){
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    private static boolean taskSecond() {
        Scanner scanner = new Scanner(System.in);
        boolean result;
        System.out.println("Укажите целое для первой переменной:");
        int a = scanner.nextInt();
        System.out.println("Укажите целое для второй переменной:");
        int b = scanner.nextInt();

        int x = a + b;
        if ((x > 9) & (x < 21)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    private static void taskFirst() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вычисляем выражение: x = a * (b + (c / d))");

        System.out.println("Укажите целое для переменной: a");
        int a = scanner.nextInt();
        System.out.println("Укажите целое для переменной: b");
        int b = scanner.nextInt();
        System.out.println("Укажите целое для переменной: c");
        int c = scanner.nextInt();
        System.out.println("Укажите целое для переменной: d");
        int d = scanner.nextInt();

        float x = 1.0f * a * (b + (c / d));

        System.out.println("Результат выражения: x = " + x);
    }
}
