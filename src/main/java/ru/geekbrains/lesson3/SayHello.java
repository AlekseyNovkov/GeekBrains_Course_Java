package ru.geekbrains.lesson3;

import java.util.Scanner;

public class SayHello {

    public static String sayHello(Scanner scanner) {
        System.out.print("Представьтесь пожалуйста: ");
        String scannerString = scanner.nextLine();
        System.out.println("Привет, "+ scannerString +"!\n");
        return scannerString;
    }
}
