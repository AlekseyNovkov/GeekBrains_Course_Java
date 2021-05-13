package ru.geekbrains.lesson3.common;

import java.util.Scanner;

public class PlayAgain {
    public static boolean playAgain() {
        boolean checkNextInt = false;
        int answer = 0;

        do {
            System.out.print("Повторить игру еще раз? (1 – да / 0 – нет): ");
            Scanner sc = new Scanner(System.in);
            checkNextInt = sc.hasNextInt();
            if (checkNextInt) {
                answer = sc.nextInt();
                if (answer == 1 || answer == 0) {
                    checkNextInt = true;
                } else {
                    System.out.println("Вы ввели некорректнное число! Необходимо ввести число 1 – да / 0 – нет. Попробуйте ещё раз.");
//                    checkNextInt = false;
                }
            } else {
                System.out.println("Вы ввели некорректнный символ! Необходимо ввести число 1 – да / 0 – нет. Попробуйте ещё раз.");
            }
        } while (checkNextInt == false);

        if(answer == 1){
            System.out.println("\n\n");
            return true;
        } else return false;
    }
}
