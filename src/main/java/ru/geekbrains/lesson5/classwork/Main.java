package ru.geekbrains.lesson5.classwork;

public class Main {
    public static void main(String[] args) {
//        Main m = new Main(); // инстанциирование класса

        Cat cat = new Cat();
//        cat.name = "barsic";
//        cat.age = 2;
//        cat.color = "White";
        System.out.printf("Cat %s with color %s age %d\n", cat.getName(), cat.getColor(), cat.getAge());

        Cat cat2 = new Cat("Murzic","Red", 2);
        System.out.printf("Cat %s with color %s age %d\n", cat2.getName(), cat2.getColor(), cat2.getAge());

        Cat cat3 = new Cat();
        System.out.printf("Cat %s with color %s age %d\n", cat3.getName(), cat3.getColor(), cat3.getAge());

        cat.run();
        cat.voice();
        cat.running(500);
        cat2.run();
        cat2.voice();
        cat2.running(1500);
        cat3.run();
        cat3.voice();
        cat3.running(800);

        Cat.cats.forEach(System.out::println);

        Beaver beaver = new Beaver();
        beaver.name = "Bob";
        beaver.age = 7;
        beaver.color = "Black";
        System.out.println();
    }
}
