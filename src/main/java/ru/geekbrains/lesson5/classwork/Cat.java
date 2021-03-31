package ru.geekbrains.lesson5.classwork;

import java.util.ArrayList;
import java.util.List;

public class Cat {
    static String type = "Cat";
    static List<Cat> cats = new ArrayList<>();
    private String name;
    private int age;
    private String color;
    private int meter;

    public void run(){
        System.out.printf("Cat %s running...\n", this.name);
    }

    public void running(int length){
        System.out.printf("Cat %s running for a meter %d\n", this.name, length);
    }

    public void voice(){
        System.out.printf("Cat %s meaw meaw...\n", this.name);
    }

    public Cat(String color){
        this.color = color;
    }

    public Cat(String color, int age){
        this.color = color;
        this.age = age;
    }

    public Cat(String name, String color, int age){
        this(color, age);
        this.name = name;
    }

    public Cat(){
        this("Murka", "Gray", 1);
    }

    static void doSomething (){
        System.out.println("Hello ");
    }

    @Override
    public String toString() {
        return "Cat"+ ""
                ;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
}
