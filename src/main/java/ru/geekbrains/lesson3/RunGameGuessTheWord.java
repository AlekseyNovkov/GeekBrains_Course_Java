package ru.geekbrains.lesson3;

import java.sql.SQLOutput;
import java.util.*;

import static ru.geekbrains.lesson3.PlayAgain.playAgain;

public class RunGameGuessTheWord {
    public static void runGameGuessTheWord(String namePlayer) {
        boolean playMore = false;

        System.out.println("Игра \"Угадай слово\"");

        do {
            startGameGuessTheWord(namePlayer);
            playMore = playAgain();
        } while (playMore == true);

        System.out.println("Игра закончена.");
    }

    private static void startGameGuessTheWord(String namePlayer) {
        String playerSetLine;
        boolean checkNextLine = false;
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                        "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                        "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        ArrayList<String> arrayListWords = new ArrayList<>(Arrays.asList(words));

        String randomWord = arrayListWords.get(new Random().nextInt((arrayListWords.size()-1)));

        System.out.println("Угадайте, какое из указанных слов загадал компьютер?");
        System.out.println(arrayListWords);

        do {
            Scanner sc = new Scanner(System.in);
            checkNextLine = sc.hasNextLine();
            if (checkNextLine) {
                playerSetLine = sc.nextLine();
                if (playerSetLine.equals(randomWord)) {
                    System.out.println("Поздравляю! Вы угадали слово!");
                    checkNextLine = true;
                } else {
                    String findChars = matchesByCharacters(randomWord, playerSetLine);

                    System.out.println("Вы не угадали слово! Буквы, которые стоят на своих местах: '"+ findChars +"'. Попробуйте ещё раз.");
                }
            } else {
                System.out.println("Вы не ввели слово! Попробуйте ещё раз.");
            }
        } while (checkNextLine == false);
    }


    private static String matchesByCharacters(String randomWorld, String playerSetLine) {
        String matches = getMatches(randomWorld, playerSetLine);

        if (matches.length() < 15){
            int count = 15 - matches.length();
            for(int i=0; i < count; i++){
                matches = matches + "#";
            }
        }

        return matches;
    }


    private static String getMatches(String s1, String s2) {
        String matches = "";

        int min = Math.min(s1.length(), s2.length());
        for (int i = 0; i < min; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 == c2) {
                matches = matches + c1;
            } else {
                matches = matches + "#";
            }
        }

        return matches;
    }
}
