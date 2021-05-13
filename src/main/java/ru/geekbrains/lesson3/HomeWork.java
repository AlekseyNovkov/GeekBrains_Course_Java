package ru.geekbrains.lesson3;

// Домашнее задание:
//1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
//    При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное,
//    или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз?
//    1 – да / 0 – нет»(1 – повторить, 0 – нет).
//
//2. * Создать массив из слов
//    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
//    "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
//    "pineapple", "pumpkin", "potato"}.
//    При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным
//    словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы,
//    которые стоят на своих местах.
//    apple – загаданное
//    apricot - ответ игрока
//    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//    Для сравнения двух слов посимвольно можно пользоваться:
//    String str = "apple";
//    char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
//    Играем до тех пор, пока игрок не отгадает слово.
//    Используем только маленькие буквы.

import java.util.Scanner;

import static ru.geekbrains.lesson3.common.RunGameGuessTheNumber.runGameGuessTheNumber;
import static ru.geekbrains.lesson3.common.RunGameGuessTheWord.runGameGuessTheWord;
import static ru.geekbrains.lesson3.common.SayHello.sayHello;

public class HomeWork {

    public static void main(String[] args) {
        int playerSetNumber = 0;
        boolean checkNextInt = false;

        Scanner scanner = new Scanner(System.in);
        String namePlayer = sayHello(scanner);

        System.out.println("Выберите игру в которую будем играть: \n     1 - 'Угадай число от 0 до 9' \n     2 - 'Угадай слово' \n     Любой другой символ - завершить сеанс.");
        Scanner scGetGame = new Scanner(System.in);
        checkNextInt = scGetGame.hasNextInt();

        if (checkNextInt) {
            playerSetNumber = scGetGame.nextInt();

            if (playerSetNumber == 1) runGameGuessTheNumber(namePlayer);
            else if (playerSetNumber == 2) runGameGuessTheWord(namePlayer);
            else System.out.println("Сеанс завершен.");

        } else {
            System.out.println("Сеанс завершен.");
        }
    }

}
