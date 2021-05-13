package ru.geekbrains.lesson3.common;

import java.util.Random;
import java.util.Scanner;

import static ru.geekbrains.lesson3.common.PlayAgain.playAgain;

public class RunGameGuessTheNumber {
    public static void runGameGuessTheNumber(String namePlayer) {
        boolean playMore = false;

        System.out.println("Игра \"Угадай число от 0 до 9\"");

        do {
            startGameGuessTheNumber(namePlayer);
            playMore = playAgain();
        } while (playMore == true);

        System.out.println("Игра закончена.");
    }

    private static void startGameGuessTheNumber(String namePlayer) {
        int numberOfAttempts = 3;
        int playerSetNumber = 0;
        boolean checkNextInt = false;

        int randomNumber = new Random().nextInt(9);

        do {
            System.out.print("Угадайте число от 0 до 9 (у Вас "+ numberOfAttempts +" попытки): ");
            Scanner sc = new Scanner(System.in);
            checkNextInt = sc.hasNextInt();
            if (checkNextInt) {
                playerSetNumber = sc.nextInt();
                if (playerSetNumber >= 0 & playerSetNumber <= 9) {
                    checkNextInt = true;
                } else {
                    System.out.println("Вы ввели некорректнное число! Необходимо ввести число от 0 до 9. Попробуйте ещё раз.");
                    checkNextInt = false;
                }
            } else {
                System.out.println("Вы ввели некорректнный символ! Необходимо ввести число от 0 до 9. Попробуйте ещё раз.");
            }
        } while (checkNextInt == false);

        for (int i = 1; i <= numberOfAttempts; i++) {
            if (randomNumber == playerSetNumber) {
                System.out.println(namePlayer + ", поздравляю! Вы угадали c "+ i +" попытки!");
                break;
            } else {
                System.out.println("Указанное вами число "+ playerSetNumber +" "+ moreOrLessNumber(randomNumber, playerSetNumber) +" загаданного.");
                if(i == numberOfAttempts){
                    System.out.println("Вы проиграли. Может, в следующий раз повезет.");
                    break;
                } else {
                    do {
                        System.out.print("Укажите другое число: ");
                        Scanner sc = new Scanner(System.in);
                        checkNextInt = sc.hasNextInt();
                        if (checkNextInt) {
                            playerSetNumber = sc.nextInt();
                            if (playerSetNumber >= 0 & playerSetNumber <= 9) {
                                checkNextInt = true;
                            } else {
                                System.out.println("Вы ввели не корректнное число! Необходимо ввести число от 0 до 9. Попробуйте ещё раз.");
                                checkNextInt = false;
                            }
                        } else {
                            System.out.println("Вы ввели не корректнный символ! Необходимо ввести число от 0 до 9. Попробуйте ещё раз.");
                        }
                    } while (checkNextInt == false);
                }
            }
        }
    }

    private static String moreOrLessNumber(int randomNumber, int playerSetNumber) {
        if (playerSetNumber > randomNumber) {
            return ">";
        } else {
            return "<";
        }
    }
}
