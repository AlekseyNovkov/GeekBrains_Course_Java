package ru.geekbrains.lesson2;

/**
 * Project java_core_1_0321
 *
 * @Author Alexander Grigorev
 * Created 13.03.2021
 * v1.0
 */
public class ClassWork {
    //switch
    //while
    //do while
    //for
    //arrays
    //foreach

    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int[] arr1 = {1, 2, 3};
        String[] strings = {""};
        arr[0][0] = 10;
        arr[2][3] = 0;

        int[][] arr2 = new int[3][];
        arr2[0] = new int[10];
        arr2[1] = new int[5];
        arr2[2] = new int[20];

        int[][][][][][][] superArr = new int[10][][][][][][];
        superArr[0] = new int[20][][][][][];
        superArr[0][0] = new int[4][][][][];
        superArr[0][0][0] = new int[3][][][];

        int[][][] arr3d = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };


        int[][] arr3 = {
                {1, 23, 4},
                {5},
                {54, 8, 26},
                {48, 512, 36}
        };
        printArray2d(arr3);

//        for (int i : arr1) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

//        for (int y = 0; y < arr.length; y++) {
//            for (int x = 0; x < arr[y].length; x++) {
//                System.out.print(arr[y][x] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println(arr1);
//        System.out.println(arr);
//        System.out.println(strings);

    }

    private static void printArray2d(int[][] arr2) {
        for (int y = 0; y < arr2.length; y++) {
            for (int x = 0; x < arr2[y].length; x++) {
                System.out.print(arr2[y][x] + " ");
            }
            System.out.println();
        }
    }

    private static void oneArrExample() {
        int a = 10;
        int b = 1;
        int c = 20;
        int d = 500;
        int e = 100500;
        int sum = a + b + c + d + e;
//        System.out.println(sum);

        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        arr[4] = e;

        int cArr[] = new int[5];

        int[] arr1 = {1, 2, 3, 4, 5, 6, 78, 10};
        String[] strings = new String[10];
        String[] strings1 = {"one", "two", "three", "four", "five"};

//        strings1[4] = "Some else string";
//        System.out.println(strings1[4]);
//
//        System.out.println(arr1.length);

        int sum1 = 0;
//        for (int i = 0; i < arr1.length; i++) {
//            if (i % 2 != 0) continue;
//            sum1 += arr1[i];
//            System.out.println("Current sum is: " + sum1);
//        }
//        for (int i = arr1.length - 1; i >= 0; i--) {
//            if (i % 2 != 0) continue;
//            sum1 += arr1[i];
//            System.out.println("Current sum is: " + sum1);
//        }

//        for (int i = arr.length - 1; i >= 0; i--) {
//            if (arr[i] % 500 == 0) continue;
//            System.out.println(arr[i]);
//        }

        for (int i : arr1) {
            System.out.println(i);
        }
        for (int aa : arr1) {
            System.out.println(sum1 += aa);
            aa = sum1;
        }
        for (int aa : arr1) {
            System.out.println(aa);
        }

//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//            if (arr1[i] == 6) {
//                System.out.println("Found 6");
//                break;
//            }
//        }
    }

    private static void loopsExample() {
        int a = 1;

        while (a < 1) {
            System.out.println(a++);
//            if (a == 50) break;
        }

        do {
            System.out.println(a++);
        } while (a > 50);
//                  инициализация         условие             итерация
        for (int i = 0, j = 10, k = 50; i < 20 && j < 20; i++, j += 2, k--) {
            //%d - int, %f - floating, %s -> String, %% -> %, %b -> boolean
            System.out.printf("i = %d, j = %d, k = %d\n", i, j, k);
            System.out.println(10 == 10);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; ; ) {
            System.out.println(++i);
            if (i == 100) {
                i = 1000500;
                System.out.println(i);
                break;
            }
        }
    }

    private static void switchExample() {
        int a = 0;
        if (a == 0) a = 1;
        else a = 0;

        a = (a == 0 ? 1 : 0);

        String recipient = "Vova1";

//        if (recipient.equals("Petya")) {
//            System.out.println("Put this letter to box # 1");
//            System.out.println("Sorting letters");
//            // Some else code
//        }
//        else if (recipient.equals("Kolya")) System.out.println("Put this letter to box # 2");
//        else if (recipient.equals("Vasya")) System.out.println("Put this letter to box # 3");
//        else if (recipient.equals("Igor")) System.out.println("Put this letter to box # 4");
//        else if (recipient.equals("Petr")) System.out.println("Put this letter to box # 5");
//        else if (recipient.equals("Egor")) System.out.println("Put this letter to box # 6");
//        else if (recipient.equals("Alex")) System.out.println("Put this letter to box # 7");
//        else if (recipient.equals("Amir")) System.out.println("Put this letter to box # 8");
//        else if (recipient.equals("Timur")) System.out.println("Put this letter to box # 9");
//        else if (recipient.equals("Vlad")) System.out.println("Put this letter to box # 10");
//        else System.out.println("Put this letter to the bag");

//        switch (recipient) {
//            case "Petr":
//                System.out.println("Put this letter to box # 1");
//                break;
//            case "Ivan":
//                System.out.println("Put this letter to box # 2");
//                System.out.println("something");
//                //some important code
//                break;
//            case "Vova":
//                System.out.println("Put this letter to box # 3");
//                break;
//            case "Petya":
//                System.out.println("Put this letter to box # 4");
//                break;
//            default:
//                System.out.println("Nothing");
//
//        }

        int b = 10;
        if (b == 1) System.out.println("one");
        else if (b == 2) System.out.println("two");

        switch (b) {
            case (1) : System.out.println("1!");
            case (2) : System.out.println("two");
        }
        switch (recipient) {
            case ("Petr") : System.out.println("Put this letter to box # 1");
            case ("Ivan") :  System.out.println("Put this letter to box # 2");
            case ("Vova") :  System.out.println("Put this letter to box # 3");
            case ("Petya") :  System.out.println("Put this letter to box # 4");
            default : System.out.println("Nothing");

        }
    }
}
